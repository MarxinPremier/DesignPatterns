package com.wangzuo.designpatterns.factory.concrete;

import com.wangzuo.designpatterns.factory.inter.Human;

/**
 * Created by hejie on 2017/5/14.
 *
 * 白种人
 *
 */

public class WhiteHuman implements Human{


    @Override
    public String getColor() {
        return "白皮肤";
    }

    @Override
    public String talk() {
        return "白种人";
    }
}
