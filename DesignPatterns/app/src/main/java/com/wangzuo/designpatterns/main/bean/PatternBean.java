package com.wangzuo.designpatterns.main.bean;

/**
 * Created by hejie on 2017/5/13.
 */

public class PatternBean {

    String name;

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
