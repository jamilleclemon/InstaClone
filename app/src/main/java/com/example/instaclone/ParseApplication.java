package com.example.instaclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();


        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("kiVjOVvlcPxO81Tt96dc5CZw0fuLTWYNTyFGQNXl")
                .clientKey("ngNhQSkz01dfpkXVhOtJGaS1eqXJ3ONi59szxU4f")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
