package com.wangzuo.designpatterns.factory.concrete;

import com.wangzuo.designpatterns.factory.inter.Human;

/**
 * Created by hejie on 2017/5/14.
 *
 * 黄种人
 *
 */

public class YellowHuman implements Human{


    @Override
    public String getColor() {
        return "黄皮肤";
    }

    @Override
    public String talk() {
        return "黄种人";
    }
}
