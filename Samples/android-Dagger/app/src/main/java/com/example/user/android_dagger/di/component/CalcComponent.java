package com.example.user.android_dagger.di.component;

import com.example.user.android_dagger.calculation.Calculation;
import com.example.user.android_dagger.di.module.CalcModule;
import com.example.user.android_dagger.view.mainactivity.MainActivity;

import javax.inject.Singleton;

import dagger.Subcomponent;

/**
 * Author: singh on: 26-Sep-17.
 */

@Singleton
@Subcomponent(modules = CalcModule.class)
public interface CalcComponent {


    //Using the @Inject in the MainActivity for Multiplication class instance
    void inject(MainActivity mainActivity);

    //returns the Calculation class instance using the @Inject in its constructor
    //and injecting the Addition class as a dependency in Calculation class
    Calculation getCalculation();


}
