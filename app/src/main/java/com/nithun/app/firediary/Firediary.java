package com.nithun.app.firediary;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by nithun on 11/21/16.
 */

public class Firediary extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(this);


    }
}
