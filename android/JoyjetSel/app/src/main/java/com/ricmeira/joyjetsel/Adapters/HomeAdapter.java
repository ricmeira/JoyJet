package com.ricmeira.joyjetsel.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.ricmeira.joyjetsel.R;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by ricar on 2/2/2017.
 */

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder>{
    private static HomeAdapter.ClickListener clickListener;

    HashMap<Integer,Boolean> selected = new HashMap<Integer, Boolean>();
    private ArrayList<String> mValues;

    public HomeAdapter(ArrayList values) {
        this.mValues = values;
    }

    public HomeAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_home_recycler_view, parent, false);

        return new HomeAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(HomeAdapter.ViewHolder holder, int position) {
        String value = mValues.get(position);


    }

    public void setOnItemClickListener(HomeAdapter.ClickListener clickListener) {
        this.clickListener = clickListener;
    }



    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public boolean getSelectedItem(int itemPos){
        return selected.get(itemPos);
    }

    public void setSelectedItem(int itemPos,boolean status){
        selected.put(itemPos,status);
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public final ImageView photo;
        View v;

        public ViewHolder(View view) {
            super(view);
            photo= (ImageView) view.findViewById(R.id.photo_imageview);

            v = view;
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            clickListener.onClick(getAdapterPosition(),v);

        }
    }

    public interface ClickListener {
        void onClick(int pos,View v);
    }
}