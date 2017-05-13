package com.wangzuo.designpatterns.main.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.wangzuo.designpatterns.R;
import com.wangzuo.designpatterns.main.bean.PatternBean;

import java.util.ArrayList;

/**
 * Created by hejie on 2017/5/13.
 * <p>
 * 设计模式适配器
 */

public class PatternAdapter extends BaseAdapter {


    private final ArrayList<?> data;
    private final Context context;

    public PatternAdapter(Context context, ArrayList<?> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.main_list_view_item, null);
            viewHolder.name = (TextView) convertView.findViewById(R.id.name);
            convertView.setTag(viewHolder);
        }else {
            viewHolder= (ViewHolder) convertView.getTag();
        }
        viewHolder.name.setText(((PatternBean)data.get(position)).getName());
        return convertView;

    }

    /**
     * 布局持有器
     */
    class ViewHolder {
        TextView name;
    }

}
