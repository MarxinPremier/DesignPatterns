package com.wangzuo.designpatterns.commandMode.bean;

import android.graphics.Path;

import com.wangzuo.designpatterns.commandMode.inter.IBrush;

/**
 * Created by hejie on 2016/10/31.
 */
public class CircleBrush implements IBrush {

    @Override
    public void down(Path path, float x, float y) {

    }

    @Override
    public void move(Path path, float x, float y) {
        path.addCircle(x,y,10, Path.Direction.CW);
    }

    @Override
    public void up(Path path, float x, float y) {

    }
}
