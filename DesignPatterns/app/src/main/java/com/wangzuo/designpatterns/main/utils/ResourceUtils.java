package com.wangzuo.designpatterns.main.utils;

import android.content.Context;

import com.wangzuo.designpatterns.R;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/**
 * Created by hejie on 2017/5/13.
 * <p>
 * 资源工具类
 */

public class ResourceUtils {

    /**
     * 获得raw数据
     *
     * @return
     */
    public static String getRawData(Context context,int id) {
        try {
            InputStream inputStream = context.getResources().openRawResource(id);
            InputStreamReader reader = new InputStreamReader(inputStream, "utf-8");
            BufferedReader bufferedReader = new BufferedReader(reader);
            StringBuffer stringBuffer = new StringBuffer();
            String line;
            while ((line = bufferedReader.readLine())!=null){
                stringBuffer.append(line);
                stringBuffer.append("\n");
            }
            return stringBuffer.toString();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
