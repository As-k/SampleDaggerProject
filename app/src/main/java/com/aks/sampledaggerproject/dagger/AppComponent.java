package com.aks.sampledaggerproject.dagger;

import com.aks.sampledaggerproject.car.Driver;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {
    Driver getDriver();
}
