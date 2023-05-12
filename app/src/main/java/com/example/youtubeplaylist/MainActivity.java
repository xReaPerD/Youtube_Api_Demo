package com.example.youtubeplaylist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.youtubeplaylist.API.SingletonRetrofitObject;
import com.example.youtubeplaylist.Adapter.MyAdapter;
import com.example.youtubeplaylist.Model.Items;
import com.example.youtubeplaylist.Model.VideoDetals;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.hasFixedSize();

        dropApiCall();
    }

    private void dropApiCall() {

        Call<VideoDetals> videoModelCall = SingletonRetrofitObject.getmInstance().getAPI().getVideoDetails(
                getString(R.string.ApiKey),
                "UC4L7czrqbS7ebMf5dX5L1SQ",
                "snippet",
                "date",
                "50",
                "video"
        );

        videoModelCall.enqueue(new Callback<VideoDetals>() {
            @Override
            public void onResponse(Call<VideoDetals> call, Response<VideoDetals> response) {
                setRecyclerView(response.body().getItems());
            }

            @Override
            public void onFailure(Call<VideoDetals> call, Throwable t) {

            }
        });

    }

    private void setRecyclerView(Items[] items) {
        MyAdapter myadapter = new MyAdapter(this,items);
        recyclerView.setAdapter(myadapter);

    }
}