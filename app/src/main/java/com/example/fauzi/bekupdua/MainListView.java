package com.example.fauzi.bekupdua;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fauzi on 21/06/2016.
 */
public class MainListView extends AppCompatActivity {

    private ListView listView;
    private ListView_adapter ListView_adapter;
    List<String> names = new ArrayList<String>();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);
        listView = (ListView) findViewById(R.id.listView);
        names.add("johan");
        names.add("joha");
        names.add("joan");

        ListView_adapter = new ListView_adapter(this, android.R.layout.simple_list_item_1, names);
        listView.setAdapter(ListView_adapter);
    }


}
