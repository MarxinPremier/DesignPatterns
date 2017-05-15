package com.wangzuo.designpatterns.builder.concrete;

import android.content.Context;

import com.wangzuo.designpatterns.builder.inter.CarModel;
import com.wangzuo.designpatterns.main.utils.ToastUtils;

/**
 * Created by hejie on 2017/5/15.
 *
 * 宝马车
 *
 */

public class BenzCar extends CarModel{

    private final Context context;

    public BenzCar(Context context){
        this.context =  context;
    }

    @Override
    protected void start() {
        ToastUtils.show(context,"奔驰车启动");
    }

    @Override
    protected void stop() {
        ToastUtils.show(context,"奔驰车停止");
    }

    @Override
    protected void alarm() {
        ToastUtils.show(context,"奔驰车鸣笛");
    }

    @Override
    protected void engineBoom() {
        ToastUtils.show(context,"奔驰车引擎作响");
    }
}
