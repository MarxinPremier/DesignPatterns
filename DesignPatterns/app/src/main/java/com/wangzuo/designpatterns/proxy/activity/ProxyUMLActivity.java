package com.wangzuo.designpatterns.proxy.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.wangzuo.designpatterns.R;
import com.wangzuo.designpatterns.main.activity.BaseUMLActivity;
import com.wangzuo.designpatterns.main.constants.URLConstants;

public class ProxyUMLActivity extends BaseUMLActivity{

    @Override
    protected String getUrl() {
        return URLConstants.PROXY_UML_IMG;
    }

    @Override
    protected String getDes() {
        return "为其他对象提供一种代理以控制对这个对象的访问";
    }
}
