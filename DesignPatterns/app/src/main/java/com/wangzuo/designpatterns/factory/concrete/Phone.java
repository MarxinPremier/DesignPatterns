package com.wangzuo.designpatterns.factory.concrete;

import com.wangzuo.designpatterns.factory.inter.Product;

/**
 * Created by hejie on 2017/5/14.
 *
 * 具体产品，手机
 *
 */

public class Phone extends Product{

    @Override
    public String getModel() {
        return "手机";
    }
}
