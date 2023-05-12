package com.example.youtubeplaylist.API;

import com.example.youtubeplaylist.Model.VideoDetals;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface API {

    @GET("search")
    Call<VideoDetals> getVideoDetails(@Query("key") String key,
                                      @Query("channelId") String channelId,
                                      @Query("part") String part,
                                      @Query("order") String order,
                                      @Query("maxResults") String maxResult,
                                      @Query("type") String type); //here https://www.youtube.com/watch?v=hN7Gq0RGRdY&list=PLoCB1drFDolMPVZ2y0Eyefvb7b2_1Hxrj&index=4 3:18

}
