package com.example.joelg.clapp;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by joelg on 17/11/2017.
 */

@Entity(nameInDb = "Task")
public class Job {
    @Id(autoincrement = true)
    private Long id;

    @Property(nameInDb = "isDone")
    private String isDone;


    @Property(nameInDb = "title")
    private String title;


    @Generated(hash = 1888685964)
    public Job(Long id, String isDone, String title) {
        this.id = id;
        this.isDone = isDone;
        this.title = title;

    }


    @Generated(hash = 1361810761)
    public Job() {
    }


    public Long getId() {
        return this.id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getIsDone() {
        return this.isDone;
    }


    public void setIsDone(String isDone) {
        this.isDone = isDone;
    }


    public String getTitle() {
        return this.title;
    }


    public void setTitle(String title) {
        this.title = title;
    }



}
