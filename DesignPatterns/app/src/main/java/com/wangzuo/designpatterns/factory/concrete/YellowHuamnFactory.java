package com.wangzuo.designpatterns.factory.concrete;

import com.wangzuo.designpatterns.factory.inter.Human;
import com.wangzuo.designpatterns.factory.inter.HumanFactory;

/**
 * Created by hejie on 2017/5/14.
 *
 * 白种人工厂
 *
 */

public class YellowHuamnFactory extends HumanFactory {

    @Override
    public Human createHuman() {
        return new YellowHuman();
    }
}
