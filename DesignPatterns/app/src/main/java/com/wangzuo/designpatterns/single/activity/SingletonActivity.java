package com.wangzuo.designpatterns.single.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.wangzuo.designpatterns.R;
import com.wangzuo.designpatterns.main.activity.BaseActivity;
import com.wangzuo.designpatterns.main.utils.ActivityGuider;

import butterknife.BindView;
import butterknife.OnClick;

public class SingletonActivity extends BaseActivity {

    @BindView(R.id.singleton_uml_btn)
    Button singletonUmlBtn;
    @BindView(R.id.singleton_uml_example)
    Button singletonUmlExample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_singleton;
    }


    @OnClick({R.id.singleton_uml_btn, R.id.singleton_uml_example})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.singleton_uml_btn:
                ActivityGuider.turn(this,"com.wangzuo.designpatterns.single.activity.SingletonUMLActivity");
                break;
            case R.id.singleton_uml_example:
                ActivityGuider.turn(this,"com.wangzuo.designpatterns.single.activity.SingletonExampleActivity");
                break;
        }
    }
}
