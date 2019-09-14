package com.aks.sampledaggerproject.dagger;

import com.aks.sampledaggerproject.car.DieselEngine;
import com.aks.sampledaggerproject.car.Engine;
import com.aks.sampledaggerproject.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class DieselEngineModule {

 /*   private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    int providesHorsePower(){
        return horsePower;
    }*/

    @Binds
    abstract Engine bindEngine(DieselEngine engine);
}
