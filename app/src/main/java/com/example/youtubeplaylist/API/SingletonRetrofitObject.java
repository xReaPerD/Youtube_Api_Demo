package com.example.youtubeplaylist.API;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SingletonRetrofitObject {

    private static SingletonRetrofitObject mInstance;
    private static final String BASE_URL = "https://www.googleapis.com/youtube/v3";
    private static Retrofit retrofit;

    private SingletonRetrofitObject(){
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
     public synchronized SingletonRetrofitObject getmInstance(){
        if (mInstance == null){
            mInstance = new SingletonRetrofitObject();
        }
        return mInstance;
     }

     public API getAPI(){
        return retrofit.create(API.class);
     }
}
