package com.wangzuo.designpatterns.builder.activity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.wangzuo.designpatterns.R;
import com.wangzuo.designpatterns.main.activity.BaseActivity;
import com.wangzuo.designpatterns.main.constants.URLConstants;

import butterknife.BindView;

public class BuilderExampleActivity extends BaseActivity {

    @BindView(R.id.builder_example_uml_img)
    ImageView builderExampleUmlImg;

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
    }


    @Override
    protected int getLayout() {
        return R.layout.activity_builder_example;
    }

}
