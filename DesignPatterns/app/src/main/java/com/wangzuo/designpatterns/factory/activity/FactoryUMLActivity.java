package com.wangzuo.designpatterns.factory.activity;

import com.wangzuo.designpatterns.main.activity.BaseUMLActivity;
import com.wangzuo.designpatterns.main.constants.URLConstants;

public class FactoryUMLActivity extends BaseUMLActivity {

    @Override
    protected String getUrl() {
        return URLConstants.FACTORY_UML_IMG;
    }

    @Override
    protected String getDes() {
        return "定义一个用于创建对象的接口,让子类决定实例化哪一个类,工厂方法使一个类的实例化延迟到其子类";
    }
}
