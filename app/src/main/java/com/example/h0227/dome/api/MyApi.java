package com.example.h0227.dome.api;

import com.example.h0227.dome.bean.Bean;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface MyApi {
    String url = "http://gank.io/api/";
    @GET("data/%E7%A6%8F%E5%88%A9/20/1")
    Observable<Bean> getData();
}
