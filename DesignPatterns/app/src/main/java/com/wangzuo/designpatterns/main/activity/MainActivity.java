package com.wangzuo.designpatterns.main.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.alibaba.fastjson.JSON;
import com.wangzuo.designpatterns.R;
import com.wangzuo.designpatterns.main.adapter.PatternAdapter;
import com.wangzuo.designpatterns.main.bean.PatternBean;
import com.wangzuo.designpatterns.main.utils.ActivityGuider;
import com.wangzuo.designpatterns.main.utils.JsonUtils;
import com.wangzuo.designpatterns.main.utils.ResourceUtils;
import com.wangzuo.designpatterns.main.utils.ToastUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import butterknife.BindView;

public class MainActivity extends BaseActivity implements AdapterView.OnItemClickListener{

    @BindView(R.id.main_list_view)
    ListView listView;

    ArrayList<PatternBean> data = new ArrayList<>();
    private PatternAdapter patternAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initListView();
    }

    /**
     * 初始化listview
     */
    private void initListView() {
        //获得数据
        String rawData = ResourceUtils.getRawData(this, R.raw.design_pattern_data);
        //解析数据
        data.addAll(JsonUtils.getObjectToList(JsonUtils.getKeyResult(rawData, "data"), PatternBean.class));
        //初始化listview
        patternAdapter = new PatternAdapter(this,data);
        listView.setAdapter(patternAdapter);
        listView.setOnItemClickListener(this);
        patternAdapter.notifyDataSetChanged();
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        ActivityGuider.turn(this,data.get(position).getClass_name());
    }
}
