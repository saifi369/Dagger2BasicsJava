package com.saifi369.dagger2basicsjava.di;

import com.saifi369.dagger2basicsjava.Utils.DataStorageHelper;
import com.saifi369.dagger2basicsjava.Utils.Transaction;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class DataStorageModule {

    @Provides
    public static Transaction provideTransaction() {
        return new Transaction(System.currentTimeMillis());
    }

    @Provides
    public static DataStorageHelper provideDataStorageHelper(Transaction transaction) {
        DataStorageHelper helper = new DataStorageHelper(transaction);
        helper.setStoragePermission(true);
        return helper;
    }

}
