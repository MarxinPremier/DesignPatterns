package com.wangzuo.designpatterns.commandMode.bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by hejie on 2016/10/31.
 */
public class DrawInvoker {
    private List<DrawPath> drawList = Collections.synchronizedList(new ArrayList<DrawPath>());
}
