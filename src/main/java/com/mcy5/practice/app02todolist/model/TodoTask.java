package com.mcy5.practice.app02todolist.model;

import java.util.Random;

public class TodoTask {

    private String task;
    private String creationDate;
    private String estimatedTime;
    private String id;

    public TodoTask(){}

    public TodoTask(String task,String creationDate,String estimatedTime,String id){
        this.task = task;
        this.creationDate = creationDate;
        this.estimatedTime = estimatedTime;
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(String estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "TodoTask{" +
                "task='" + task + '\'' +
                ", creationDate='" + creationDate + '\'' +
                ", estimatedTime='" + estimatedTime + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
