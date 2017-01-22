package com.project.hansen.listapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListView_CustomAdapter extends BaseAdapter {
    ArrayList<String> nama = new ArrayList<String>();
    ArrayList<String> nim = new ArrayList<String>();
    Context context;

    public ListView_CustomAdapter(Context context, ArrayList<String> nama, ArrayList<String> nim){
        this.context = context;
        this.nama = nama;
        this.nim = nim;
    }

    @Override
    public int getCount() {
        return nim.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.single_list, null);
        ImageView imageView  = (ImageView) convertView.findViewById(R.id.profpic);
        TextView name = (TextView) convertView.findViewById(R.id.nama);
        TextView numb = (TextView) convertView.findViewById(R.id.nim);
        switch (position){
            case 0:
                imageView.setImageResource(R.drawable.a1);
                break;

            case 1:
                imageView.setImageResource(R.drawable.a2);
                break;

            case 2:
                imageView.setImageResource(R.drawable.a3);
                break;

            case 3:
                imageView.setImageResource(R.drawable.a4);
                break;
        }
        name.setText(nama.get(position));
        numb.setText(nim.get(position));
        return convertView;
    }
}
