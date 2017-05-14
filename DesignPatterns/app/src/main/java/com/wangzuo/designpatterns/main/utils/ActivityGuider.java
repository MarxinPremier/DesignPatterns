package com.wangzuo.designpatterns.main.utils;

import android.app.Activity;
import android.content.Intent;

import com.wangzuo.designpatterns.single.activity.SingletonActivity;

/**
 * Created by hejie on 2017/5/14.
 * <p>
 * activity跳转向导
 */

public class ActivityGuider {

    /**
     * 根据字符串名字跳转到相应页面
     *
     * @param activity
     * @param name
     */
    public static void turn(Activity activity, String name) {
        if (name == null || name == ""){
            ToastUtils.show(activity,"空");
            return;
        }
        try {
            activity.startActivity(new Intent(activity, Class.forName(name)));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
