package com.example.joelg.clapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.text);

        // Put this in a different thread or use AsyncSession in greenDAO.
        // For Demo purpose, this query is made on main thread but it should in a different thread.
        User user = ((DemoApp)getApplication()).getDaoSession().getUserDao().load(1L);


        List<Job> jobList = ((DemoApp)getApplication()).getDaoSession().getJobDao().loadAll();

        for(Job j:jobList){
            Log.d("Job_D", j.getTitle())
;        }

        if(user != null){
            textView.setText(user.getName());
        }
    }
}
