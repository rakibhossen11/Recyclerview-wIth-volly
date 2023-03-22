package com.example.recyclerwithvolly;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyVIewHolder> {

    private List<MyItem> list;
    private Context context;

    public MyAdapter(List<MyItem> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public MyVIewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_layout,parent,false);
        MyVIewHolder viewHolder = new MyVIewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyVIewHolder holder, int position) {
        final MyItem myItemPosition = list.get(position);
        holder.headText.setText(myItemPosition.getHead());
        holder.desText.setText(myItemPosition.getDesc());
        Picasso.get().load(myItemPosition.getImageUrl()).into(holder.imageView);

        holder.headText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,myItemPosition.getHead(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
