package com.wangzuo.designpatterns.templeteMethod.activity;

import android.os.Bundle;
import android.view.View;

import com.wangzuo.designpatterns.R;
import com.wangzuo.designpatterns.main.activity.BaseActivity;
import com.wangzuo.designpatterns.main.utils.ActivityGuider;

import butterknife.OnClick;

public class TemplateMethodActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_template_method;
    }


    @OnClick({R.id.template_method_uml_btn, R.id.template_method_example_btn})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.template_method_uml_btn:
                ActivityGuider.turn(this,"com.wangzuo.designpatterns.templeteMethod.activity.TemplateMethodUMLActivity");
                break;
            case R.id.template_method_example_btn:
                ActivityGuider.turn(this,"com.wangzuo.designpatterns.templeteMethod.activity.TemplateMethodExampleActivity");
                break;
        }
    }
}
