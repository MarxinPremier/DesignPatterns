package com.wangzuo.designpatterns.single.bean;

/**
 * Created by hejie on 2017/5/14.
 *
 * 枚举单例
 *
 */

public enum EnumSingleTon {

    SINGLE_TON;

    private Inner inner;

    /**
     * 在枚举中我们明确了构造方法限制为私有，在我们访问枚举实例时会执行构造方法，
     * 同时每个枚举实例都是static final类型的，也就表明只能被实例化一次
     * 《Effective Java》中推荐写法，jdk1.5后才有Enum特性
     * 它不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象，可谓是很坚强的壁垒啊
     */
    EnumSingleTon(){
        inner = new Inner();
    }

    public Inner getSingleTon(){
        return inner;
    }
}

class Inner{

}
