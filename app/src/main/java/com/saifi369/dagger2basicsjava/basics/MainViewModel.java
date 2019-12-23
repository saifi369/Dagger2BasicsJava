package com.saifi369.dagger2basicsjava.basics;

import com.saifi369.dagger2basicsjava.network.NetworkClient;

import javax.inject.Inject;

public class MainViewModel {

    private final NetworkClient mClient;

    @Inject
    public MainViewModel(NetworkClient networkClient) {
        this.mClient = networkClient;
    }

    public String fetchData(){
        return mClient.fetchData();
    }
}
