package com.aks.sampledaggerproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.aks.sampledaggerproject.car.Car;
import com.aks.sampledaggerproject.dagger.ActivityComponent;
import com.aks.sampledaggerproject.dagger.DaggerActivityComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityComponent activityComponent = DaggerActivityComponent.builder()
                .horsePower(150)
                .engineCapacity(1400)
                .appComponent(((ExampleApp)getApplication()).getAppComponent()).build();
        activityComponent.inject(this);

        car.drive();
        car2.drive();
    }
}
