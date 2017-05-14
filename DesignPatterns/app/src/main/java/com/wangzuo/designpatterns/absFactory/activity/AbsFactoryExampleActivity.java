package com.wangzuo.designpatterns.absFactory.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.wangzuo.designpatterns.R;
import com.wangzuo.designpatterns.absFactory.concrete.CreateOne;
import com.wangzuo.designpatterns.absFactory.concrete.CreateTwo;
import com.wangzuo.designpatterns.main.activity.BaseActivity;
import com.wangzuo.designpatterns.main.constants.URLConstants;
import com.wangzuo.designpatterns.main.utils.ToastUtils;

import butterknife.BindView;
import butterknife.OnClick;

public class AbsFactoryExampleActivity extends BaseActivity {

    @BindView(R.id.abs_factory_example_uml)
    ImageView absFactoryExampleUml;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        init();

    }

    /**
     * 初始化
     */
    private void init() {
        //初始化UML
        Picasso.with(this).load(URLConstants.ABS_FACTORY_PRO_UML_IMG).into(absFactoryExampleUml);
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_abs_factory_example;
    }

    @OnClick({R.id.abs_factory_createA1, R.id.abs_factory_createA2, R.id.abs_factory_createB1, R.id.abs_factory_createB2})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.abs_factory_createA1:
                ToastUtils.show(this, new CreateOne().createProductA().doSomething());
                break;
            case R.id.abs_factory_createA2:
                ToastUtils.show(this, new CreateTwo().createProductA().doSomething());

                break;
            case R.id.abs_factory_createB1:
                ToastUtils.show(this, new CreateOne().createProductB().doSomething());

                break;
            case R.id.abs_factory_createB2:
                ToastUtils.show(this, new CreateTwo().createProductB().doSomething());

                break;
        }
    }
}
