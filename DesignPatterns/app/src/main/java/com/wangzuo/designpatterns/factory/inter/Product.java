package com.wangzuo.designpatterns.factory.inter;

/**
 * Created by hejie on 2017/5/14.
 *
 * 产品类
 *
 */

public abstract class Product {

    public String getName(){
        return "产品";
    }

    public abstract String getModel();
}
