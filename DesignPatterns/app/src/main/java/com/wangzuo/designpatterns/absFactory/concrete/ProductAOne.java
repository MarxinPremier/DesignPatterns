package com.wangzuo.designpatterns.absFactory.concrete;

import com.wangzuo.designpatterns.absFactory.inter.AbsProductA;
import com.wangzuo.designpatterns.absFactory.inter.AbsProductB;

/**
 * Created by hejie on 2017/5/14.
 */

public class ProductAOne extends AbsProductA{

    @Override
    public String doSomething() {
        return "产品A1";
    }
}
