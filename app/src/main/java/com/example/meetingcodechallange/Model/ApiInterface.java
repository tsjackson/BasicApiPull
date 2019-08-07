package com.example.meetingcodechallange.Model;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("bins/n8jxy")
    Call<InformationPojo> getAddress();
}
