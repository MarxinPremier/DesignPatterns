package com.wangzuo.designpatterns.builder.inter;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.EventListener;

/**
 * Created by hejie on 2017/5/15.
 * <p>
 * 汽车模板
 */

public abstract class CarModel {

    public static final String START = "start";
    public static final String STOP = "stop";
    public static final String ALARM = "alarm";
    public static final String ENGINE_BOOM = "engineBoom";

    /**
     * 该参数是各个基本方法执行的顺序
     */
    private ArrayList<String> sequence = new ArrayList<>();

    /**
     * 发动
     */
    protected abstract void start();

    /**
     * 停止
     */
    protected abstract void stop();

    /**
     * 喇叭
     */
    protected abstract void alarm();

    /**
     * 引擎
     */
    protected abstract void engineBoom();

    /**
     * 运行
     */
    final public void run() {
        for (String motion : sequence) {
            if (motion.equals(START)) {
                start();
            } else if (motion.equals(STOP)) {
                stop();
            } else if (motion.equals(ALARM)) {
                alarm();
            } else if (motion.equals(ENGINE_BOOM)) {
                engineBoom();
            }
        }
    }

    /**
     * 设置顺序
     * @param sequence
     */
    final public void setSequence(ArrayList<String> sequence){
        this.sequence.clear();
        this.sequence.addAll(sequence);
    }

}
