package com.saifi369.dagger2basicsjava.basics;

import com.saifi369.dagger2basicsjava.network.NetworkClient;

public class MainViewModel {

    private NetworkClient mClient;

    public MainViewModel(NetworkClient networkClient) {
        this.mClient = networkClient;
    }

    public String fetchData(){
        return mClient.fetchData();
    }
}
