package com.wangzuo.designpatterns.absFactory.inter;

/**
 * Created by hejie on 2017/5/14.
 */

public abstract class AbsCreator {

    /**
     * 创建A产品家族
     * @return
     */
    public abstract AbsProductA createProductA();

    /**
     * 创建B产品家族
     * @return
     */
    public abstract AbsProductB createProductB();

}
