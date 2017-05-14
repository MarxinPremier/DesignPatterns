package com.wangzuo.designpatterns.factory.concrete;

import com.wangzuo.designpatterns.factory.inter.Product;

/**
 * Created by hejie on 2017/5/14.
 *
 * 具体产品，电脑
 *
 */

public class Computer extends Product{

    @Override
    public String getModel() {
        return "电脑";
    }
}
