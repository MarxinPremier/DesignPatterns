package com.wangzuo.designpatterns.commandMode.bean;

import android.graphics.Path;

import com.wangzuo.designpatterns.commandMode.inter.IBrush;

/**
 * Created by hejie on 2016/10/31.
 *
 * 普通的笔触
 */
public class NormalBrush implements IBrush {
    @Override
    public void down(Path path, float x, float y) {
        path.moveTo(x,y);
    }

    @Override
    public void move(Path path, float x, float y) {
        path.lineTo(x,y);
    }

    @Override
    public void up(Path path, float x, float y) {

    }
}
