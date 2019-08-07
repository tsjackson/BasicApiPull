package com.example.meetingcodechallange.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.meetingcodechallange.Model.ApiInterface;
import com.example.meetingcodechallange.Model.InformationPojo;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CustomViewModel extends ViewModel {
    private static final String TAG = "CustomViewModel";
    private static final String BASE_URL = "https://api.myjson.com/";
    private static ApiInterface api;

    private MutableLiveData<InformationPojo> getAddressData;

//    MutableLiveData<POJO> mutableLiveData = new MutableLiveData<>();
    LiveData<InformationPojo> liveData;
//
    public LiveData<InformationPojo> getData(){
        if(getAddressData == null){
            getAddressData = new MutableLiveData<>();
            networkCall();
        }
        return getAddressData;
    }
//
//
    public void networkCall(){
        initRetrofit().getAddress().enqueue(new Callback<InformationPojo>() {
            @Override
            public void onResponse(Call<InformationPojo> call, Response<InformationPojo> response) {
                getAddressData.setValue(response.body());
            }

            @Override
            public void onFailure(Call<InformationPojo> call, Throwable t) {

            }
        });
    }
//}

    public CustomViewModel(){}

    public ApiInterface initRetrofit(){
        api = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ApiInterface.class);
        return api;
    }

}
