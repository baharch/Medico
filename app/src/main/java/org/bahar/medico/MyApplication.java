package org.bahar.medico;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by Bahar on 1/8/2018.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate(){
        super.onCreate();
        Realm.init(this);
        RealmConfiguration config= new RealmConfiguration.Builder().build();
        Realm.setDefaultConfiguration(config);
    }
}
