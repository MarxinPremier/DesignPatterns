package com.wangzuo.designpatterns.factory.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.wangzuo.designpatterns.R;
import com.wangzuo.designpatterns.factory.concrete.BlackHuamnFactory;
import com.wangzuo.designpatterns.factory.concrete.WhiteHuamnFactory;
import com.wangzuo.designpatterns.factory.concrete.YellowHuamnFactory;
import com.wangzuo.designpatterns.main.activity.BaseActivity;
import com.wangzuo.designpatterns.main.constants.URLConstants;
import com.wangzuo.designpatterns.main.utils.ToastUtils;

import butterknife.BindView;
import butterknife.OnClick;

public class FactoryMoreActivity extends BaseActivity {

    @BindView(R.id.factory_more_uml_img)
    ImageView factoryMoreUmlImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        init();

    }

    /**
     * 初始化
     */
    private void init() {
        //初始化UML图
        Picasso.with(this).load(URLConstants.FACTORY_MORE_UML_IMG).into(factoryMoreUmlImg);
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_factory_more;
    }

    @OnClick({R.id.factory_white_people, R.id.factory_black_people, R.id.factory_yellow_people})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.factory_white_people:
                ToastUtils.show(this,new WhiteHuamnFactory().createHuman().getColor());
                break;
            case R.id.factory_black_people:
                ToastUtils.show(this,new BlackHuamnFactory().createHuman().getColor());
                break;
            case R.id.factory_yellow_people:
                ToastUtils.show(this,new YellowHuamnFactory().createHuman().getColor());
                break;
        }
    }
}
