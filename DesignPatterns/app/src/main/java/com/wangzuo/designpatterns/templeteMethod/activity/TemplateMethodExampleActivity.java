package com.wangzuo.designpatterns.templeteMethod.activity;

import android.os.Bundle;
import android.view.View;

import com.wangzuo.designpatterns.R;
import com.wangzuo.designpatterns.main.activity.BaseActivity;
import com.wangzuo.designpatterns.templeteMethod.concrete.Benz;
import com.wangzuo.designpatterns.templeteMethod.concrete.Bwm;

import butterknife.OnClick;

public class TemplateMethodExampleActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_template_method_example;
    }

    @OnClick({R.id.template_method_benz_btn, R.id.template_method_bmw_btn})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.template_method_benz_btn:
                new Benz(this).run();
                break;
            case R.id.template_method_bmw_btn:
                new Bwm(this).run();
                break;
        }
    }
}
