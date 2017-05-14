package com.wangzuo.designpatterns.templeteMethod.inter;

/**
 * Created by hejie on 2017/5/14.
 */

public abstract class AbstractCar {


    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();
    protected abstract void engineBoom();

    final public void run(){
        //先开动汽车
        start();
        //引擎隆隆作响
        engineBoom();
        //鸣笛
        alarm();
        //停车
        stop();
    }

}
