package com.example.weavrjavatest;

import android.app.Application;

import androidx.annotation.Nullable;

import io.weavr.components.UXComponents;
import io.weavr.components.okay.core.PsaENV;
import io.weavr.components.okay.core.data.model.ExceptionLogger;
import io.weavr.components.utils.ENV;


public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        UXComponents.Companion.initialize(this, ENV.SANDBOX, "UI_KEY");
        UXComponents.Companion.getPsa().initialize(
                this,
                PsaENV.SANDBOX,
                new ExceptionLogger() {
                    @Override
                    public void exception(@Nullable String s, @Nullable Exception e) {

                    }

                    @Override
                    public void setUserIdentificator(@Nullable String s) {

                    }
                }
                ) ;

    }
}
