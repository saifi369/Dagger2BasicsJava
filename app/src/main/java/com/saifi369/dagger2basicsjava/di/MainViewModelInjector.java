package com.saifi369.dagger2basicsjava.di;

import com.saifi369.dagger2basicsjava.basics.MainViewModel;

import dagger.Component;

@Component
public interface MainViewModelInjector {

    MainViewModel getMainViewModel();

}
