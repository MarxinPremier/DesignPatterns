package com.wangzuo.designpatterns.commandMode.inter;

import android.graphics.Canvas;

/**
 * Created by hejie on 2016/10/31.
 *
 * 绘制命令接口
 */
public interface IDraw {

    /**
     * 绘制命令
     * @param canvas
     */
    void draw(Canvas canvas);

    /**
     * 撤销命令
     */
    void undo();
}

