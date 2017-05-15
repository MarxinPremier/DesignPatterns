package com.wangzuo.designpatterns.proxy.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.wangzuo.designpatterns.R;
import com.wangzuo.designpatterns.main.activity.BaseActivity;

public class NormalProxyActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_normal_proxy;
    }
}
