package com.wangzuo.designpatterns.absFactory.activity;

import android.os.Bundle;
import android.view.View;

import com.wangzuo.designpatterns.R;
import com.wangzuo.designpatterns.main.activity.BaseActivity;
import com.wangzuo.designpatterns.main.utils.ActivityGuider;

import butterknife.OnClick;

public class AbsFactoryActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected int getLayout() {
        return R.layout.activity_abs_factory;
    }

    @OnClick({R.id.abs_factory_uml_btn, R.id.abs_factory_example_btn})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.abs_factory_uml_btn:
                ActivityGuider.turn(this,"com.wangzuo.designpatterns.absFactory.activity.AbsFactoryUMLActivity");
                break;
            case R.id.abs_factory_example_btn:
                ActivityGuider.turn(this,"com.wangzuo.designpatterns.absFactory.activity.AbsFactoryExampleActivity");
                break;
        }
    }
}
