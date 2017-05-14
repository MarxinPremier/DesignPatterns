package com.wangzuo.designpatterns.single.activity;

import android.graphics.ImageFormat;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.wangzuo.designpatterns.R;
import com.wangzuo.designpatterns.main.activity.BaseActivity;
import com.wangzuo.designpatterns.single.bean.DLCSingleTon;
import com.wangzuo.designpatterns.single.bean.EnumSingleTon;
import com.wangzuo.designpatterns.single.bean.HungrySingleTon;
import com.wangzuo.designpatterns.single.bean.LazySingleTon;
import com.wangzuo.designpatterns.single.bean.StaticLazySingleTon;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SingletonExampleActivity extends BaseActivity {


    @BindView(R.id.singleton_uml_btn)
    Button singletonUmlBtn;
    @BindView(R.id.left_text)
    TextView leftText;
    @BindView(R.id.right_text)
    TextView rightText;
    private boolean flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleton_example);
        ButterKnife.bind(this);
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_singleton_example;
    }

    @OnClick({R.id.singleton_uml_btn, R.id.left_text, R.id.right_text})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.singleton_uml_btn:
                if (flag) {
                    setContent(leftText);
                    flag = false;
                } else {
                    setContent(rightText);
                    flag = true;
                }
                break;
            case R.id.left_text:
                break;
            case R.id.right_text:
                break;
        }
    }

    private void setContent(TextView textView) {
        textView.setText(
                "  双锁--" + DLCSingleTon.getSingleton() + "\n" +
                        "  枚举--" + EnumSingleTon.SINGLE_TON.getSingleTon()+ "\n" +
                        "  饿汉--" + HungrySingleTon.getSingleton() + "\n" +
                        "  懒汉--" + LazySingleTon.getSingleton() + "\n" +
                        "  静态懒汉--" + StaticLazySingleTon.getSingleton() + "\n"
        );
    }
}
