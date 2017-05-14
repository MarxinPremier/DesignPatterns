package com.wangzuo.designpatterns.factory.inter;

/**
 * Created by hejie on 2017/5/14.
 *
 * 抽象工厂类
 *
 */

public abstract class Factory {

    public abstract <T extends Product> T createPhone(Class<T> clazz);

}
