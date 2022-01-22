package com.mcy5.practice.app02todolist.controller;

import com.mcy5.practice.app02todolist.model.TodoTask;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface TodoControllerInterface {

    @GetMapping(value = "/tasks",consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<List<TodoTask>> getAllTasks();

    @GetMapping(value="/tasks/{id}",consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<List<TodoTask>> getTaskById(@PathVariable("id") String id);
}
