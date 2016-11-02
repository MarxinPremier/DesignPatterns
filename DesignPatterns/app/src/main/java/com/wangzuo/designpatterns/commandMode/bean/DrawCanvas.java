package com.wangzuo.designpatterns.commandMode.bean;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by hejie on 2016/11/2.
 * <p>
 * 绘制的真正执行者
 */

public class DrawCanvas extends SurfaceView implements SurfaceHolder.Callback {
    private boolean isDrawing, isRunning;
    private DrawInvoker mDrawInvoker;
    private DrawThread mDrawThread;
    private Bitmap mBitmap;

    public DrawCanvas(Context context, AttributeSet attrs) {
        super(context, attrs);

        mDrawInvoker = new DrawInvoker();
        mDrawThread = new DrawThread();
        getHolder().addCallback(this);
    }

    /**
     * 增加一条绘制路径
     *
     * @param path
     */
    public void add(DrawPath path) {
        mDrawInvoker.add(path);
    }

    /**
     * 重做上一步撤销的绘制
     */
    public void redo() {
        isDrawing = true;
        mDrawInvoker.redo();
    }

    /**
     * 撤销上一步的绘制
     */
    public void undo() {
        isDrawing = true;
        mDrawInvoker.undo();
    }

    /**
     * 是否可以重做
     *
     * @return
     */
    public boolean canRedo() {
        return mDrawInvoker.canRedo();
    }

    /**
     * 是否可以撤销
     *
     * @return
     */
    public boolean canUndo() {
        return mDrawInvoker.canUndo();
    }

    @Override
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        isRunning = true;
        mDrawThread.start();
    }

    @Override
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {
        mBitmap = Bitmap.createBitmap(i1, i2, Bitmap.Config.RGB_565);
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        boolean retry = true;
        isRunning = false;
        while (retry) {
            try {
                mDrawThread.join();
                retry = false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 绘制线程
     */
    private class DrawThread extends Thread {
        Canvas canvas = null;

        @Override
        public void run() {
            while (isRunning) {
                if (isDrawing) {
                    try {
                        canvas = getHolder().lockCanvas(null);
                        if (mBitmap == null) {
                            mBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                        }
                        Canvas c = new Canvas(mBitmap);
                        c.drawColor(0, PorterDuff.Mode.CLEAR);
                        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                        mDrawInvoker.execute(c);
                        canvas.drawBitmap(mBitmap, 0, 0, null);
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        getHolder().unlockCanvasAndPost(canvas);
                    }
                    isDrawing = false;
                }
            }
        }
    }
}
