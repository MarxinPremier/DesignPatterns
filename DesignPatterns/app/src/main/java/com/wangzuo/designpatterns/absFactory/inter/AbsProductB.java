package com.wangzuo.designpatterns.absFactory.inter;

/**
 * Created by hejie on 2017/5/14.
 */

public abstract class AbsProductB {

    /**
     * 每个产品公有的方法
     */
    public void shareMethod(){

    }

    /**
     * 每个产品相同的方法,不同实现
     */
    public abstract String  doSomething();

}
