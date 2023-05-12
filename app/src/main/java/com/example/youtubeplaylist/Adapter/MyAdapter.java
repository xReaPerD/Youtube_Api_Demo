package com.example.youtubeplaylist.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.youtubeplaylist.Model.Items;
import com.example.youtubeplaylist.R;
import com.squareup.picasso.Picasso;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    Context context;

    public MyAdapter(Context context, Items[] items) {
        this.context = context;
        this.items = items;
    }

    Items[] items;
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.items,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.videoTitle.setText(items[position]
                .getSnippet()
                .getTitle());

        Picasso.get().load(items[position]
                        .getSnippet()
                        .getThumbnails()
                        .getHigh()
                        .getUrl())
                .into(holder.videoHolder);

    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
