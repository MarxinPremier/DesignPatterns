package com.wangzuo.designpatterns.builder.concrete;

import android.content.Context;

import com.wangzuo.designpatterns.builder.inter.CarModel;

import java.util.ArrayList;

/**
 * Created by hejie on 2017/5/15.
 */

public class Director {

    private ArrayList<String> sequence = new ArrayList<>();
    private BenzBuilder benzBuilder;
    private BmwBuilder bmwBuilder;

    public Director(Context context) {
        benzBuilder = new BenzBuilder(context);
        bmwBuilder = new BmwBuilder(context);
    }

    /**
     * 奔驰a
     *
     * @return
     */
    public BenzCar getBenzA() {
        this.sequence.clear();
        this.sequence.add(CarModel.ENGINE_BOOM);
        this.sequence.add(CarModel.START);
        this.sequence.add(CarModel.STOP);
        return (BenzCar) benzBuilder.setSequence(sequence).getCarModel();
    }

    /**
     * 奔驰b
     *
     * @return
     */
    public BenzCar getBenzB() {
        this.sequence.clear();
        this.sequence.add(CarModel.START);
        return (BenzCar) benzBuilder.setSequence(sequence).getCarModel();
    }

    /**
     * 宝马a
     *
     * @return
     */
    public BmwCar getBmwA() {
        this.sequence.clear();
        this.sequence.add(CarModel.START);
        this.sequence.add(CarModel.STOP);
        return (BmwCar) bmwBuilder.setSequence(sequence).getCarModel();
    }

    /**
     * 宝马b
     *
     * @return
     */
    public BmwCar getBmwB() {
        this.sequence.clear();
        this.sequence.add(CarModel.START);
        this.sequence.add(CarModel.ENGINE_BOOM);
        this.sequence.add(CarModel.STOP);
        return (BmwCar) bmwBuilder.setSequence(sequence).getCarModel();
    }


}
