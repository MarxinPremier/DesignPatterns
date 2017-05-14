package com.wangzuo.designpatterns.factory.concrete;

import com.wangzuo.designpatterns.factory.inter.Human;

/**
 * Created by hejie on 2017/5/14.
 *
 * 黑种人
 *
 */

public class BlackHuman implements Human{


    @Override
    public String getColor() {
        return "黑皮肤";
    }

    @Override
    public String talk() {
        return "黑种人";
    }
}
