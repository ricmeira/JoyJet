package com.ricmeira.joyjetsel.RetrofitInterface;

import com.ricmeira.joyjetsel.Model.Json;

import java.util.List;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by ricar on 2/2/2017.
 */

public interface JsonEndpointInterface {

    @GET("mobile-test-one.json")
    Call<List<Json>> getJson();

}
