package com.example.shaloin.fourthassignmentb;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class CustomListActivity extends ListActivity {

    ArrayList<User> userlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.custom_list);
        userlist=new ArrayList<>();
        userlist.add(new User("Ybsj",78965412));
        userlist.add(new User("sncud",321456987));
        userlist.add(new User("Khhs",258741963));
        userlist.add(new User("sdvnd",369852147));
        userlist.add(new User("weqwew",123789456));
        userlist.add(new User("mcncb",951753486));
        userlist.add(new User("lksj",973158462));

        MyAdapter adapter=new MyAdapter(getApplicationContext(),userlist);
        setListAdapter(adapter);
    }
}
