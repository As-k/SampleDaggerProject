package com.aks.sampledaggerproject;

import android.app.Application;

import com.aks.sampledaggerproject.dagger.AppComponent;
import com.aks.sampledaggerproject.dagger.DaggerAppComponent;

public class ExampleApp extends Application {
    AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.create();
    }

    public AppComponent getAppComponent() {
        return component;
    }
}
