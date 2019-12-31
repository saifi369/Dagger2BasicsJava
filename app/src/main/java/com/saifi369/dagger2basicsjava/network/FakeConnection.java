package com.saifi369.dagger2basicsjava.network;

import javax.inject.Inject;

public class FakeConnection implements Connection {

    @Inject
    public FakeConnection() {

    }

    @Override
    public String doReq() {
        return "This is testing connection";
    }
}
