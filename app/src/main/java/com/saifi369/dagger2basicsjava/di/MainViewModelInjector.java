package com.saifi369.dagger2basicsjava.di;

import com.saifi369.dagger2basicsjava.MainActivity;
import com.saifi369.dagger2basicsjava.basics.MainViewModel;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = {DataStorageModule.class, RealConnectionModule.class})
public interface MainViewModelInjector {

    MainViewModel getMainViewModel();

    void injectFields(MainActivity mainActivity);

    @Component.Builder
    interface Builder {

        MainViewModelInjector build();

        @BindsInstance
        Builder setEndPoint(String endPoint);

    }

}
