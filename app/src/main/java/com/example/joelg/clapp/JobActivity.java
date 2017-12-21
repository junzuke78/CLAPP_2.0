package com.example.joelg.clapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;

import com.example.joelg.clapp.db.DaoSession;

import java.util.List;

public class JobActivity extends AppCompatActivity {

    private View.OnClickListener checkBoxListener;
    //private CardView cv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job);
        Toolbar HeaderToolbar = (Toolbar) findViewById(R.id.Task_header);
        setSupportActionBar(HeaderToolbar);
        RecyclerView RV = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager LLM = new LinearLayoutManager(this);
        RV.setLayoutManager(LLM);
        RV.setHasFixedSize(true);


        final CheckBox IsDone = (CheckBox) findViewById(R.id.isDone);
        final DaoSession daoSession = ((AppController) getApplication()).getDaoSession();

        // Put this in a different thread or use AsyncSession in greenDAO.
        // For Demo purpose, this query is made on main thread but it should  a different thread.
        User user = daoSession.getUserDao().load(1L);
        final List<Task> jobList = ((AppController) getApplication()).getDaoSession().getTaskDao().loadAll();
        Log.d("DEBUG_RV", "Loaded itms : " + jobList.size());
        TaskAdapter TaskAdapter = new TaskAdapter(jobList);
        RV.setAdapter(TaskAdapter);


    }


}








