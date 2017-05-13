package com.wangzuo.designpatterns.main.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by hejie on 2017/5/13.
 *
 * toast工具类
 *
 */

public class ToastUtils {

    /**
     *
     * @param context
     * @param charSequence
     */
    public static void show(Context context,CharSequence charSequence){
        Toast.makeText(context,charSequence,Toast.LENGTH_SHORT).show();
    }

}
