package com.wangzuo.designpatterns.factory.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.wangzuo.designpatterns.R;
import com.wangzuo.designpatterns.factory.concrete.Computer;
import com.wangzuo.designpatterns.factory.concrete.EEFactory;
import com.wangzuo.designpatterns.factory.concrete.Phone;
import com.wangzuo.designpatterns.main.activity.BaseActivity;
import com.wangzuo.designpatterns.main.utils.ToastUtils;

import butterknife.BindView;
import butterknife.OnClick;

public class FactorySimpleActivity extends BaseActivity {

    @BindView(R.id.factory_phone)
    Button factoryPhone;
    @BindView(R.id.factory_computer)
    Button factoryComputer;
    EEFactory factory = new EEFactory();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_factory_simple;
    }

    @OnClick({R.id.factory_phone, R.id.factory_computer})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.factory_phone:
                ToastUtils.show(this, factory.createPhone(Phone.class).getModel());
                break;
            case R.id.factory_computer:
                ToastUtils.show(this, factory.createPhone(Computer.class).getModel());
                break;
        }
    }
}
