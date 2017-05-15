package com.wangzuo.designpatterns.builder.concrete;

import android.content.Context;
import android.content.pm.ProviderInfo;

import com.wangzuo.designpatterns.builder.inter.CarBuilder;
import com.wangzuo.designpatterns.builder.inter.CarModel;

import java.util.ArrayList;

/**
 * Created by hejie on 2017/5/15.
 */

public class BmwBuilder extends CarBuilder{

    private final Context context;
    private final BmwCar car;

    public BmwBuilder(Context context){
        this.context = context;
        this.car = new BmwCar(context);
    }

    @Override
    public CarBuilder setSequence(ArrayList<String> sequence) {
        this.car.setSequence(sequence);
        return this;
    }

    @Override
    public CarModel getCarModel() {
        return this.car;
    }

}
