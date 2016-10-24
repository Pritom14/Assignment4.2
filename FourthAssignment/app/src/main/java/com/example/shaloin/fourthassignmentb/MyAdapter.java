package com.example.shaloin.fourthassignmentb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by shaloin on 24/10/16.
 */

public class MyAdapter extends BaseAdapter {

    ArrayList<User> users;
    Context context;
    LayoutInflater inflater;

    public MyAdapter(Context context,ArrayList<User> users){

        this.context=context;
        this.users=users;
        inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }
    @Override
    public int getCount() {
        return users.size();
    }

    @Override
    public Object getItem(int position) {
        return users.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view=inflater.inflate(R.layout.custom_list,null);
        TextView tvname=(TextView)view.findViewById(R.id.textNameID);
        TextView tvphone=(TextView)view.findViewById(R.id.textPhoneID);
        tvname.setText(users.get(position).getName());
        tvphone.setText(""+users.get(position).getPhone());
        return view;
    }
}
