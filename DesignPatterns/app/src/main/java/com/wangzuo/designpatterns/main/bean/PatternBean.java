package com.wangzuo.designpatterns.main.bean;

/**
 * Created by hejie on 2017/5/13.
 */

public class PatternBean {

    String name;
    String class_name;

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PatternBean{" +
                "name='" + name + '\'' +
                '}';
    }
}
