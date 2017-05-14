package com.wangzuo.designpatterns.factory.activity;

import android.os.Bundle;
import android.view.View;

import com.wangzuo.designpatterns.R;
import com.wangzuo.designpatterns.main.activity.BaseActivity;
import com.wangzuo.designpatterns.main.utils.ActivityGuider;

import butterknife.OnClick;

public class FactoryActivity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_factory;
    }


    @OnClick({R.id.factory_uml_btn, R.id.factory_simple_btn,R.id.factory_more_btn})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.factory_uml_btn:
                ActivityGuider.turn(this, "com.wangzuo.designpatterns.factory.activity.FactoryUMLActivity");
                break;
            case R.id.factory_simple_btn:
                ActivityGuider.turn(this, "com.wangzuo.designpatterns.factory.activity.FactorySimpleActivity");
                break;
            case R.id.factory_more_btn:
                ActivityGuider.turn(this, "com.wangzuo.designpatterns.factory.activity.FactoryMoreActivity");
                break;
        }
    }

}
