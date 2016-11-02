package com.wangzuo.designpatterns.commandMode.activity;

import android.app.Activity;
import android.app.ExpandableListActivity;
import android.graphics.ImageFormat;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import com.wangzuo.designpatterns.R;
import com.wangzuo.designpatterns.commandMode.bean.CircleBrush;
import com.wangzuo.designpatterns.commandMode.bean.DrawCanvas;
import com.wangzuo.designpatterns.commandMode.bean.DrawPath;
import com.wangzuo.designpatterns.commandMode.bean.NormalBrush;
import com.wangzuo.designpatterns.commandMode.inter.IBrush;

/**
 * Created by hejie on 2016/11/2.
 * <p/>
 * 命令模式的activity
 */

public class DrawActivity extends Activity {

    private DrawCanvas mDrawCanvas;//绘制画布
    private DrawPath mDrawPath;//路径绘制命令
    private Paint mPaint;//画笔对象
    private IBrush mBrush;//笔触对象
    private Button undoBtn;
    private Button redoBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.command_mode_layout);

        init();
    }

    /**
     * 初始化
     */
    private void init() {
        findView();

        mPaint = new Paint();
        mPaint.setColor(0xffffffff);
        mPaint.setStrokeWidth(3);

        mBrush = new NormalBrush();
        mDrawCanvas.setOnTouchListener(new DrawTouchListener());
        undoBtn.setEnabled(false);
        redoBtn.setEnabled(false);

    }


    /**
     * 找到控件
     */
    private void findView() {
        undoBtn = (Button) findViewById(R.id.undo_btn);
        redoBtn = (Button) findViewById(R.id.redo_btn);
        mDrawCanvas = (DrawCanvas) findViewById(R.id.canvas);
    }

    /**
     * 监听
     *
     * @param view
     */
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {

            case R.id.red_btn:
                mPaint = new Paint();
                mPaint.setStrokeWidth(3);
                mPaint.setColor(0xffff0000);
                break;
            case R.id.green_btn:
                mPaint = new Paint();
                mPaint.setStrokeWidth(3);
                mPaint.setColor(0xff00ff00);
                break;
            case R.id.blue_btn:
                mPaint = new Paint();
                mPaint.setStrokeWidth(3);
                mPaint.setColor(0xff0000ff);
                break;
            case R.id.normal_btn:
                mBrush = new NormalBrush();
                break;
            case R.id.circle_btn:
                mBrush = new CircleBrush();
                break;
            case R.id.undo_btn:
                mDrawCanvas.undo();
                if (!mDrawCanvas.canUndo()) {
                    undoBtn.setEnabled(false);
                }
                redoBtn.setEnabled(true);
                break;

            case R.id.redo_btn:
                mDrawCanvas.redo();
                if (!mDrawCanvas.canRedo()) {
                    redoBtn.setEnabled(false);
                }
                undoBtn.setEnabled(true);
                break;
        }
    }

    private class DrawTouchListener implements View.OnTouchListener {

        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                mDrawPath = new DrawPath();
                mDrawPath.paint = mPaint;
                mDrawPath.path = new Path();
                mBrush.down(mDrawPath.path, motionEvent.getX(), motionEvent.getY());
            } else if (motionEvent.getAction() == MotionEvent.ACTION_MOVE) {
                mBrush.move(mDrawPath.path, motionEvent.getX(), motionEvent.getY());
            } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                mBrush.up(mDrawPath.path, motionEvent.getX(), motionEvent.getY());
                mDrawCanvas.add(mDrawPath);
                mDrawCanvas.isDrawing = true;

                undoBtn.setEnabled(false);
                redoBtn.setEnabled(false);
            }
            return true;
        }
    }
}
