package com.example.firstapplication.Helper;

import android.view.View;

public class CustomOnItemClickListener implements View.OnClickListener {
    private int  position;
    private OnItemClickCallBack itemClickCallBack;

    //consturctor
    public CustomOnItemClickListener(int position, OnItemClickCallBack itemClickCallBack){
        this.position = position;
        this.itemClickCallBack = itemClickCallBack;
    }


    @Override
    public void onClick(View view) {
        itemClickCallBack.DataClick(view, position);
    }

    //interface
    public interface OnItemClickCallBack{
        //void
        void DataClick(View view, int position);
    }
}
