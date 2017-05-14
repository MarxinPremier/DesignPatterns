package com.wangzuo.designpatterns.builder.activity;

import android.os.Bundle;
import android.view.View;

import com.wangzuo.designpatterns.R;
import com.wangzuo.designpatterns.main.activity.BaseActivity;
import com.wangzuo.designpatterns.main.utils.ActivityGuider;

import butterknife.OnClick;

public class BuilderActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_builder;
    }

    @OnClick({R.id.builder_uml_btn, R.id.builder_example_btn})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.builder_uml_btn:
                ActivityGuider.turn(this,"com.wangzuo.designpatterns.builder.activity.BuilderUMLActivity");
                break;
            case R.id.builder_example_btn:
                ActivityGuider.turn(this,"com.wangzuo.designpatterns.builder.activity.BuilderExampleActivity");
                break;
        }
    }
}
