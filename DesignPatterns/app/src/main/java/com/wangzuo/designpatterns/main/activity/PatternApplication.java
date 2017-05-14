package com.wangzuo.designpatterns.main.activity;

import android.app.Application;
import android.content.Context;

/**
 * Created by hejie on 2017/5/14.
 */

public class PatternApplication extends Application{

    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }
}
