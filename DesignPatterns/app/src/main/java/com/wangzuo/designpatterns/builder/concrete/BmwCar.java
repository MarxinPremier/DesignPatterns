package com.wangzuo.designpatterns.builder.concrete;

import android.content.Context;

import com.wangzuo.designpatterns.builder.inter.CarModel;
import com.wangzuo.designpatterns.main.utils.ToastUtils;

import java.net.PortUnreachableException;

/**
 * Created by hejie on 2017/5/15.
 *
 * 宝马车
 *
 */

public class BmwCar extends CarModel{

    private final Context context;

    public BmwCar(Context context){
        this.context =  context;
    }

    @Override
    protected void start() {
        ToastUtils.show(context,"宝马车启动");
    }

    @Override
    protected void stop() {
        ToastUtils.show(context,"宝马车停止");
    }

    @Override
    protected void alarm() {
        ToastUtils.show(context,"宝马车鸣笛");
    }

    @Override
    protected void engineBoom() {
        ToastUtils.show(context,"宝马车引擎作响");
    }
}
