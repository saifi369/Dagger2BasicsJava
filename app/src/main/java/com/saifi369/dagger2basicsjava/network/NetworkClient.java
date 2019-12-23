package com.saifi369.dagger2basicsjava.network;


public class NetworkClient {

    private NetworkConnection mConnection;

    public NetworkClient(NetworkConnection connection) {
        this.mConnection = connection;
    }

    public String fetchData(){
        return mConnection.doReq();
    }
}