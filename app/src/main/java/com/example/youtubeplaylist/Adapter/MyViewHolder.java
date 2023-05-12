package com.example.youtubeplaylist.Adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.youtubeplaylist.R;

public class MyViewHolder extends RecyclerView.ViewHolder {

    public ImageView videoHolder;
    public TextView videoTitle;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        videoHolder = itemView.findViewById(R.id.VideoStream);
        videoTitle = itemView.findViewById(R.id.videoTitle);
    }
}
