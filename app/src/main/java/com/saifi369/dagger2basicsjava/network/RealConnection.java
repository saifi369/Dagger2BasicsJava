package com.saifi369.dagger2basicsjava.network;

import javax.inject.Inject;

public class RealConnection implements Connection {

    private final String mEndpoint;

    @Inject
    public RealConnection(String endpoint) {
        this.mEndpoint = endpoint;

//        if (BuildConfig.DEBUG) {
//            this.mEndpoint = Constants.DEBUG_ENDPOINT;
//        } else {
//            this.mEndpoint = Constants.PROD_ENDPOINT;
//        }

    }

    @Override
    public String doReq() {
        return mEndpoint;
    }
}
