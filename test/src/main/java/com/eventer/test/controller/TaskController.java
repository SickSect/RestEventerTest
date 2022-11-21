package com.eventer.test.controller;

import com.eventer.test.model.Task;
import com.eventer.test.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.BeanUtils;

@RestController
public class TaskController {

    @Autowired
    private TaskRepository repo;

    @PostMapping("/tasks")
    public Task create(@RequestBody Task task){
        return repo.save(task);
    }
}
