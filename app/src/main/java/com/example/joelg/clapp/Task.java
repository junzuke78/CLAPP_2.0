package com.example.joelg.clapp;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by joelg on 20/11/2017.
 */

@Entity(nameInDb = "Task")
public class Task {

    @Property(nameInDb = "title")
    private String title;

    @Property(nameInDb = "IsDone")
    private int IsDone;

    @Property(nameInDb = "time")
    private int timeStamp;

    @Id(autoincrement = true)
    private Long id;

    @Generated(hash = 688392082)
    public Task(String title, int IsDone, int timeStamp, Long id) {
        this.title = title;
        this.IsDone = IsDone;
        this.timeStamp = timeStamp;
        this.id = id;
    }

    @Generated(hash = 733837707)
    public Task() {
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIsDone() {
        return this.IsDone;
    }

    public void setIsDone(int IsDone) {
        this.IsDone = IsDone;
    }

    public int getTimeStamp() {
        return this.timeStamp;
    }

    public void setTimeStamp(int timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}

