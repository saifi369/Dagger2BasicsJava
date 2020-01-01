package com.saifi369.dagger2basicsjava.di;

import com.saifi369.dagger2basicsjava.network.Connection;
import com.saifi369.dagger2basicsjava.network.RealConnection;

import dagger.Module;
import dagger.Provides;

@Module
public class RealConnectionModule {

    private String mEndPoint;

    public RealConnectionModule(String mEndPoint) {
        this.mEndPoint = mEndPoint;
    }

    @Provides
    Connection provideConnection() {
        return new RealConnection(mEndPoint);
    }


}
