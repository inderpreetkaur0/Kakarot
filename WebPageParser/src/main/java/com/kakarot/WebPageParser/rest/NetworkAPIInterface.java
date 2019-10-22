package com.kakarot.WebPageParser.rest;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Rest API interfaces for given modules
 */
public interface NetworkAPIInterface {

    @GET(".")
    Call<String> getHTMLContent();
}
