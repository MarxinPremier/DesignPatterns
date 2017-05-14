package com.wangzuo.designpatterns.factory.concrete;

import com.wangzuo.designpatterns.factory.inter.Human;
import com.wangzuo.designpatterns.factory.inter.HumanFactory;

/**
 * Created by hejie on 2017/5/14.
 *
 * 黑种人工厂
 *
 */

public class BlackHuamnFactory extends HumanFactory {

    @Override
    public Human createHuman() {
        return new BlackHuman();
    }
}
