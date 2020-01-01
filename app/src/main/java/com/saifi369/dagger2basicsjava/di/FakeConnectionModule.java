package com.saifi369.dagger2basicsjava.di;

import com.saifi369.dagger2basicsjava.network.Connection;
import com.saifi369.dagger2basicsjava.network.FakeConnection;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class FakeConnectionModule {

    @Binds
    abstract Connection provideConnection(FakeConnection connection);


}
