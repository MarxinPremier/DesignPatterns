package com.wangzuo.designpatterns.templeteMethod.activity;

import com.wangzuo.designpatterns.main.activity.BaseUMLActivity;
import com.wangzuo.designpatterns.main.constants.URLConstants;

public class TemplateMethodUMLActivity extends BaseUMLActivity {

    @Override
    protected String getUrl() {
        return URLConstants.TEMPLATE_METHOD_UML_IMG;
    }

    @Override
    protected String getDes() {
        return "定义一个操作中的算法的框架,而将一些步骤延迟到子类的。使得子类可以不改变算法的" +
                "结构即可重新定义该算法的某些特定步骤";
    }
}
