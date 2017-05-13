package com.wangzuo.designpatterns.main.utils;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by hejie on 2017/5/13.
 * <p>
 * json解析工具类
 */

public class JsonUtils {


    /**
     * 根据关键字获取json数据
     *
     * @param json
     * @param key
     * @return
     */
    public static String getKeyResult(String json, String key) {
        JSONObject jsonObject = JSON.parseObject(json);
        return jsonObject.getString(key);
    }

    /**
     * 根据类名解析出集合
     * @param json
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> List<T> getObjectToList(String json,Class<T> clazz){
        JSONArray jsonArray = JSON.parseArray(json);
        Iterator<Object> iterator = jsonArray.iterator();
        List<T> container = new ArrayList<>();
        while (iterator.hasNext()){
            container.add(JSON.parseObject(iterator.next().toString(),clazz));
        }
        return container;
    }

}
