package com.saifi369.dagger2basicsjava.network;

import android.util.Log;

import javax.inject.Inject;

import static com.saifi369.dagger2basicsjava.basics.Constants.TAG;

public class NetworkTester {

    @Inject
    public NetworkTester() {
    }

    public void attachToNetwork(NetworkClient client) {
        Log.d(TAG, "attachToNetwork: attached to network");
    }
}
