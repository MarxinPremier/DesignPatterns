package com.wangzuo.designpatterns.commandMode.bean;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

import com.wangzuo.designpatterns.commandMode.inter.IDraw;

/**
 * Created by hejie on 2016/10/31.
 *
 *
 */
public class DrawPath implements IDraw{

    public Path path;//需要绘制的路径
    public Paint paint;//绘制画笔

    @Override
    public void draw(Canvas canvas) {
        canvas.drawPath(path,paint);
    }

    @Override
    public void undo() {

    }
}
