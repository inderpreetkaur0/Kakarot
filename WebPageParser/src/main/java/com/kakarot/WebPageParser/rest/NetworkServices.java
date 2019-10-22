package com.kakarot.WebPageParser.rest;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

@Module(includes = RetrofitInterface.class)
public class NetworkServices {

    @Inject
    RetrofitInterface retro;

    public NetworkServices() {
        retro = new RetrofitInterface();
    }

    /**
     * grabs a html page for the given url
     *
     * @param url
     * @return
     */
    @Provides
    public NetworkAPIInterface getHTMLPage(String url) {
        return retro.getNetworkInterface(retro.getRetrofitInstance(retro.getOkHttpInstance(), url));
    }

}
