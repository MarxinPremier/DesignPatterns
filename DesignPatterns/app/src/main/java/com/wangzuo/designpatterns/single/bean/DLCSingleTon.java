package com.wangzuo.designpatterns.single.bean;

/**
 * Created by hejie on 2017/5/14.
 * <p>
 * 双锁检测懒汉单例
 */

public class DLCSingleTon {

    private DLCSingleTon() {
    }

    /**
     * 使用volatile保证在单个线程被修改时，高速度缓存的值能马上写入物理内存
     */
    public volatile static DLCSingleTon dlcSingleTon;

    /**
     * 双锁检测，保证线程安全
     *
     * @return
     */
    public static DLCSingleTon getSingleton() {
        if (dlcSingleTon == null) {
            synchronized (DLCSingleTon.class) {
                if (dlcSingleTon == null) {
                    dlcSingleTon = new DLCSingleTon();
                }
            }
        }

        return dlcSingleTon;
    }

}
