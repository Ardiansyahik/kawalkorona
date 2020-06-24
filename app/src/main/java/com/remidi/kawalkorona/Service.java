package com.remidi.kawalkorona;


import com.remidi.kawalkorona.Model.ModelData;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {
    @GET ("indonesia")
    Call<List<ModelData>> getData();

}
