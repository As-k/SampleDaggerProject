package com.aks.sampledaggerproject.dagger;

import com.aks.sampledaggerproject.car.Rims;
import com.aks.sampledaggerproject.car.Tires;
import com.aks.sampledaggerproject.car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {

    @Provides
    Rims provideRims() {
        return new Rims();
    }

    @Provides
    static Tires provideTries() {
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires) {
        return new Wheels(rims, tires);
    }


}
