package com.wangzuo.designpatterns.main.activity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.wangzuo.designpatterns.R;
import com.wangzuo.designpatterns.main.constants.URLConstants;

import butterknife.BindView;

public class BaseUMLActivity extends BaseActivity{

    @BindView(R.id.base_uml_img)
    ImageView img;
    @BindView(R.id.base_uml_des)
    TextView des;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    /**
     * 初始化
     */
    private void init() {
        //UML图
        Picasso.with(this).load(getUrl()).into(img);
        //描述
        des.setText(getDes());
    }

    /**
     * 获得url
     * @return
     */
    protected String getUrl() {
        return "";
    }

    /**
     * 获得描述
     * @return
     */
    protected String getDes(){
        return "";
    }

    @Override
    protected int getLayout() {
        return R.layout.base_singleton_uml;
    }
}
