package com.saifi369.dagger2basicsjava.di;

import com.saifi369.dagger2basicsjava.network.Connection;
import com.saifi369.dagger2basicsjava.network.FakeConnection;

import dagger.Module;
import dagger.Provides;

@Module
public class FakeConnectionModule {

    @Provides
    Connection provideConnection(FakeConnection connection) {
        return connection;
    }


}
