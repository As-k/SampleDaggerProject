package com.aks.sampledaggerproject.car;

import android.util.Log;

import com.aks.sampledaggerproject.dagger.PerActivity;

import javax.inject.Inject;
import javax.inject.Singleton;

@PerActivity
public class Car {
    private static final String TAG = "Car";
    //    @Inject
    Driver driver;
    Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Driver driver, Engine engine, Wheels wheels) {
        this.driver = driver;
        this.engine = engine;
        this.wheels = wheels;
    }

    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }

    public void drive() {
        engine.start();
        Log.d(TAG, driver + " drive......." + this);
    }
}
