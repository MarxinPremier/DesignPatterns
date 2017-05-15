package com.wangzuo.designpatterns.proxy.activity;

import android.os.Bundle;
import android.view.View;

import com.wangzuo.designpatterns.R;
import com.wangzuo.designpatterns.main.activity.BaseActivity;
import com.wangzuo.designpatterns.main.utils.ActivityGuider;

import butterknife.OnClick;

public class ProxyActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_proxy;
    }


    @OnClick({R.id.proxy_uml_btn, R.id.proxy_example_btn})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.proxy_uml_btn:
                ActivityGuider.turn(this,"com.wangzuo.designpatterns.proxy.activity.ProxyUMLActivity");
                break;
            case R.id.proxy_example_btn:
                ActivityGuider.turn(this,"");
                break;
        }
    }
}
