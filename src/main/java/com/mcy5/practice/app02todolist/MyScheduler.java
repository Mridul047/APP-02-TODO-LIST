package com.mcy5.practice.app02todolist;

import com.mcy5.practice.app02todolist.controller.TodoController;
import com.mcy5.practice.app02todolist.model.TodoTask;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyScheduler {

    private TodoController todoController;
    public MyScheduler(TodoController theController){
        this.todoController = theController;
    }

    @Scheduled(cron="*/30 * * * * *")
    public void scheduleGetCall(){
        todoController.getAllTasks();
        System.out.println("API called !");
    }
}
