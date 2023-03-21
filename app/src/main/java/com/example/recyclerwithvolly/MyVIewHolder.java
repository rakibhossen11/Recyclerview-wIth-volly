package com.example.recyclerwithvolly;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyVIewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView headText;
    TextView desText;

    public MyVIewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageView);
        headText = itemView.findViewById(R.id.headId);
        desText = itemView.findViewById(R.id.desId);
    }
}
