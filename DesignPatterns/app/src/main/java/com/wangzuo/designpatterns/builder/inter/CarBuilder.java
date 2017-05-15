package com.wangzuo.designpatterns.builder.inter;

import java.util.ArrayList;

/**
 * Created by hejie on 2017/5/15.
 */

public abstract class CarBuilder {

    /**
     * 设置顺序
     * @param sequence
     */
    public abstract CarBuilder setSequence(ArrayList<String> sequence);

    /**
     * 获得车辆
     * @return
     */
    public abstract CarModel getCarModel();

}
