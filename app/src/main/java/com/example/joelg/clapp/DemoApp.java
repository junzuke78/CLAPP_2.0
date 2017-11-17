package com.example.joelg.clapp;

import android.app.Application;

/**
 * Created by joelg on 17/11/2017.
         */

public class DemoApp extends Application {

    private DaoSession mDaoSession;

    @Override
    public void onCreate() {
        super.onCreate();
        mDaoSession = new DaoMaster(
                new DaoMaster.DevOpenHelper(this, "greendao_demo.db").getWritableDb()).newSession();

        // USER CREATION FOR DEMO PURPOSE
        if(mDaoSession.getUserDao().loadAll().size() == 0){
            mDaoSession.getUserDao().insert(new User(1L, "Janishar Ali","", ""));
        }


//
        if(mDaoSession.getJobDao().loadAll().size() == 0){


            Job j1 = new Job(2L, "false", "Clean");
            Job j2 = new Job(3L, "false", "Clean");



            mDaoSession.getJobDao().insert(j1);
            mDaoSession.getJobDao().insert(j2);


        }
    }

    public DaoSession getDaoSession() {
        return mDaoSession;
    }
}