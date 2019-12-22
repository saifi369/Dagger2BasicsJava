package com.saifi369.dagger2basicsjava.network;


public class NetworkClient {

    private NetworkConnection mConnection;

    public NetworkClient() {
        this.mConnection =new NetworkConnection();
    }

    public String fetchData(){
        return this.mConnection.doReq();
    }
}