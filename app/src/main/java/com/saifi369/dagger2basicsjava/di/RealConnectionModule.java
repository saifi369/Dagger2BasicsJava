package com.saifi369.dagger2basicsjava.di;

import com.saifi369.dagger2basicsjava.network.Connection;
import com.saifi369.dagger2basicsjava.network.RealConnection;

import dagger.Binds;
import dagger.Module;

@Module
public interface RealConnectionModule {

    @Binds
    Connection bindsConnection(RealConnection connection);


}
