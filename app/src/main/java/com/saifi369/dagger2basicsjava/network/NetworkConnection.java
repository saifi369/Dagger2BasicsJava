package com.saifi369.dagger2basicsjava.network;

import com.saifi369.dagger2basicsjava.BuildConfig;
import com.saifi369.dagger2basicsjava.basics.Constants;

public class NetworkConnection {
    private String mEndpoint;

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

