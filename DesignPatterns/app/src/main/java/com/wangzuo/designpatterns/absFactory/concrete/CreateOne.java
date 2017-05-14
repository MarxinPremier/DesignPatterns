package com.wangzuo.designpatterns.absFactory.concrete;

import com.wangzuo.designpatterns.absFactory.inter.AbsCreator;
import com.wangzuo.designpatterns.absFactory.inter.AbsProductA;
import com.wangzuo.designpatterns.absFactory.inter.AbsProductB;

/**
 * Created by hejie on 2017/5/14.
 */

public class CreateOne extends AbsCreator{

    @Override
    public AbsProductA createProductA() {
        return new ProductAOne();
    }

    @Override
    public AbsProductB createProductB() {
        return new ProductBOne();
    }

}
