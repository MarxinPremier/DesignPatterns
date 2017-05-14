package com.wangzuo.designpatterns.factory.concrete;

import com.wangzuo.designpatterns.factory.inter.Factory;
import com.wangzuo.designpatterns.factory.inter.Product;

/**
 * Created by hejie on 2017/5/14.
 *
 * 电子产品工厂
 *
 */

public class EEFactory extends Factory{

    @Override
    public <T extends Product> T createPhone(Class<T> clazz) {
        Product product = null;
        try {
            product = (Product) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
