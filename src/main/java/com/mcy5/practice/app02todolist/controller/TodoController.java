package com.mcy5.practice.app02todolist.controller;

import com.mcy5.practice.app02todolist.model.TodoTask;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1")
public class TodoController implements TodoControllerInterface{

    private RestTemplate restTemplate;

    @Value("${baseURL}")
    private String BASE_URL;

    public TodoController(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    @Override
    public ResponseEntity<List<TodoTask>> getAllTasks(){

        ResponseEntity<List<TodoTask>> responseObject = restTemplate.exchange(BASE_URL,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<TodoTask>>() {
        });

        List<TodoTask> listOfTasks = responseObject.getBody();
        listOfTasks.forEach(task -> System.out.println(task.toString()));

        return ResponseEntity.ok(responseObject.getBody());
    }

    @Override
    public ResponseEntity<List<TodoTask>> getTaskById(String id) {

        ResponseEntity<List<TodoTask>> responseObject = restTemplate.exchange(BASE_URL,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<TodoTask>>() {
                });

        List<TodoTask> taskFound = responseObject.getBody()
                .stream()
                .filter(task -> task.getId().equals(id))
                .collect(Collectors.toList());

        return ResponseEntity.ok(taskFound);
    }

}
