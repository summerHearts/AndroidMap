package com.example.kenvin.androidmap;

import android.app.Application;

import com.baidu.mapapi.SDKInitializer;

/**
 * Created by Kenvin on 2017/10/27.
 */

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SDKInitializer.initialize(getApplicationContext());
    }
}
