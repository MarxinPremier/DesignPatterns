package com.wangzuo.designpatterns.absFactory.concrete;

import com.wangzuo.designpatterns.absFactory.inter.AbsProductA;

/**
 * Created by hejie on 2017/5/14.
 */

public class ProductATwo extends AbsProductA{

    @Override
    public String doSomething() {
        return "产品A2";
    }
}
