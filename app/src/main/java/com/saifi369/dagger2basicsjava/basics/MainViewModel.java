package com.saifi369.dagger2basicsjava.basics;

import com.saifi369.dagger2basicsjava.Utils.DataStorageHelper;
import com.saifi369.dagger2basicsjava.network.NetworkClient;

import javax.inject.Inject;

public class MainViewModel {

    private final NetworkClient mClient;
    private final DataStorageHelper mDataStorageHelper;

    @Inject
    public MainViewModel(NetworkClient networkClient,
                         DataStorageHelper dataStorageHelper) {
        this.mClient = networkClient;
        this.mDataStorageHelper = dataStorageHelper;
    }

    public String fetchData(){
        String data = mClient.fetchData();
        mDataStorageHelper.storeData(data);
        return data;
    }
}