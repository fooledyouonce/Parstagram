package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("u9nr3efUtwN8W49bYz2JlNaeKVV9gd4CHDoDQfZn")
                .clientKey("VgRJxnPv15wX8ClckuFXi3mbesqDWUyPufJPwPOX")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
