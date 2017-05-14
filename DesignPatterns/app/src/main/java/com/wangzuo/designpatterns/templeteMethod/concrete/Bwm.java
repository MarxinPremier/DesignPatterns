package com.wangzuo.designpatterns.templeteMethod.concrete;

import android.content.Context;

import com.wangzuo.designpatterns.main.utils.ToastUtils;
import com.wangzuo.designpatterns.templeteMethod.inter.AbstractCar;

/**
 * Created by hejie on 2017/5/14.
 */

public class Bwm extends AbstractCar{

    private final Context context;

    public Bwm(Context context){
        this.context = context;
    }

    @Override
    protected void start() {
        ToastUtils.show(context,"宝马车开动了");
    }

    @Override
    protected void stop() {
        ToastUtils.show(context,"宝马车停车了");
    }

    @Override
    protected void alarm() {
        ToastUtils.show(context,"宝马车鸣笛了");
    }

    @Override
    protected void engineBoom() {
        ToastUtils.show(context,"宝马车引擎作响");
    }

}
