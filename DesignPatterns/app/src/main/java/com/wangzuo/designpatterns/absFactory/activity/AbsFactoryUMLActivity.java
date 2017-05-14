package com.wangzuo.designpatterns.absFactory.activity;

import com.wangzuo.designpatterns.main.activity.BaseUMLActivity;
import com.wangzuo.designpatterns.main.constants.URLConstants;

public class AbsFactoryUMLActivity extends BaseUMLActivity{

    @Override
    protected String getUrl() {
        return URLConstants.ABS_FACTORY_UML_IMG;
    }

    @Override
    protected String getDes() {
        return "为创建一组相关或相互依赖的对象提供一个接口,而且无需指定他们的具体类";
    }
}
