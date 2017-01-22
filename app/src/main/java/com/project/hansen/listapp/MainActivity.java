package com.project.hansen.listapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<String> nama = new ArrayList<String>();
    ArrayList<String> nim = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.list);

        nama.add("Hansen");
        nama.add("William");
        nama.add("Ricky");
        nama.add("Alfino");

        nim.add("19000670012");
        nim.add("19005401232");
        nim.add("19003200232");
        nim.add("19001204123");

        ListView_CustomAdapter adapter = new ListView_CustomAdapter(this, nama, nim);
        listView.setAdapter(adapter);
    }
}
