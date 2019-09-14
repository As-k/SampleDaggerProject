package com.aks.sampledaggerproject.dagger;

import com.aks.sampledaggerproject.car.Engine;
import com.aks.sampledaggerproject.car.PetrolEngine;

import dagger.Module;
import dagger.Provides;

@Module
public class PetrolEngineModule {

    private int horsePower;

    public PetrolEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    int providesHorsePower(){
        return horsePower;
    }

    @Provides
    Engine provideEngine(PetrolEngine engine) {
        return engine;
    }
}
