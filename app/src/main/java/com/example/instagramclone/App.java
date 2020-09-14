package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("tHVXTdjkOOwJ2gFpT1uGnOvxOMmLN4IJigDZxbTt")
                // if defined
                .clientKey("cdW5pPcrQ7ldebwVhCDawWTUyAkS9G1s9FCBLEKY")
                .server("https://parseapi.back4app.com/")
                .build()
        );
    }
}
