package com.wangzuo.designpatterns.single.activity;

import com.wangzuo.designpatterns.main.activity.BaseUMLActivity;
import com.wangzuo.designpatterns.main.constants.URLConstants;


public class SingletonUMLActivity extends BaseUMLActivity{

    @Override
    protected String getUrl() {
        return URLConstants.SINGLETON_UML_IMG;
    }

    @Override
    protected String getDes() {
        return "某个类只有一个实例,而且自行实例化并向整个系统提供整个实例";
    }
}
