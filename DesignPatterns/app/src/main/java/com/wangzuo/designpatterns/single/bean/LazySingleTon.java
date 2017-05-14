package com.wangzuo.designpatterns.single.bean;

/**
 * Created by hejie on 2017/5/14.
 * <p>
 * 懒汉线程安全单例
 */

public class LazySingleTon {

    /**
     * 构造私有
     */
    private LazySingleTon() {
    }

    /**
     * 引用
     */
    private static LazySingleTon lazySingleTon;

    /**
     * 这种写法能够在多线程中很好的工作，而且看起来它也具备很好的lazy loading，
     * 但是，遗憾的是，效率很低，99%情况下不需要同步
     * @return
     */
    public static synchronized LazySingleTon getSingleton() {
        if (lazySingleTon == null)
            lazySingleTon = new LazySingleTon();
        return lazySingleTon;
    }
}
