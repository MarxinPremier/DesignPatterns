package com.wangzuo.designpatterns.builder.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.wangzuo.designpatterns.R;
import com.wangzuo.designpatterns.builder.concrete.Director;
import com.wangzuo.designpatterns.main.activity.BaseActivity;
import com.wangzuo.designpatterns.main.constants.URLConstants;

import butterknife.BindView;
import butterknife.OnClick;

public class BuilderExampleActivity extends BaseActivity {

    @BindView(R.id.builder_example_uml_img)
    ImageView builderExampleUmlImg;
    private Director director;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    /**
     * 初始化
     */
    private void init() {
        Picasso.with(this).load(URLConstants.BUILDER_EXAMPLE_UML_IMG).into(builderExampleUmlImg);
        director = new Director(this);
    }


    @Override
    protected int getLayout() {
        return R.layout.activity_builder_example;
    }

    @OnClick({R.id.builder_example_benza_btn, R.id.builder_example_benb_btn, R.id.builder_example_bmwa_btn, R.id.builder_example_bmwb_btn})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.builder_example_benza_btn:
                director.getBenzA().run();
                break;
            case R.id.builder_example_benb_btn:
                director.getBenzB().run();
                break;
            case R.id.builder_example_bmwa_btn:
                director.getBmwA().run();
                break;
            case R.id.builder_example_bmwb_btn:
                director.getBmwB().run();
                break;
        }
    }
}
