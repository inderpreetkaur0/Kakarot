package com.kakarot.WebPageParser.rest;

import androidx.annotation.NonNull;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * Add dependencies for network
 */
@Module
public class RetrofitInterface {

    @Provides
    @Singleton
    @NonNull
    public NetworkAPIInterface getNetworkInterface(Retrofit retroFit) {
        return retroFit.create(NetworkAPIInterface.class);
    }

    @Provides
    @Singleton
    @NonNull
    public Retrofit getRetrofitInstance(OkHttpClient client, String url) {
        return new Retrofit.Builder()
                .client(client)
                .baseUrl(url)
                .addConverterFactory(ScalarsConverterFactory.create())
                .build();
    }

    @Provides
    @Singleton
    public OkHttpClient getOkHttpInstance() {
        return new OkHttpClient
                .Builder()
                .build();
    }

}
