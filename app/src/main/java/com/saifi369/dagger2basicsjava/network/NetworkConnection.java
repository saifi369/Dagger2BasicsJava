package com.saifi369.dagger2basicsjava.network;

import com.saifi369.dagger2basicsjava.BuildConfig;
import com.saifi369.dagger2basicsjava.basics.Constants;

import javax.inject.Inject;

public class NetworkConnection {
    private final String mEndpoint;

    @Inject
    public NetworkConnection(){

        if(BuildConfig.DEBUG){
            this.mEndpoint= Constants.DEBUG_ENDPOINT;
        }else {
            this.mEndpoint=Constants.PROD_ENDPOINT;
        }

    }
    public String doReq() {
        return this.mEndpoint;
    }

}

