package com.wangzuo.designpatterns.builder.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.wangzuo.designpatterns.R;
import com.wangzuo.designpatterns.main.activity.BaseUMLActivity;
import com.wangzuo.designpatterns.main.constants.URLConstants;

public class BuilderUMLActivity extends BaseUMLActivity {

    @Override
    protected String getUrl() {
        return URLConstants.BUILDER_UML_IMG;
    }

    @Override
    protected String getDes() {
        return "将一个复杂对象的构建和表示分离,使得同样的构建过程可以创建不同的表示";
    }
}
