package com.saifi369.dagger2basicsjava.di;

import com.saifi369.dagger2basicsjava.Utils.DataStorageHelper;
import com.saifi369.dagger2basicsjava.Utils.Transaction;

import dagger.Module;
import dagger.Provides;

@Module
public class DataStorageModule {

    @Provides
    public static Transaction getTransaction() {
        return new Transaction(System.currentTimeMillis());
    }

    @Provides
    public static DataStorageHelper getDataStorageHelper(Transaction transaction) {
        DataStorageHelper helper = new DataStorageHelper(transaction);
        helper.setStoragePermission(true);
        return helper;
    }

}