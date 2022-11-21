package com.eventer.test.controller;

import com.eventer.test.model.Task;
import com.eventer.test.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {

    @Autowired
    private TaskRepository repo;

    @PostMapping("/tasks")
    public Task create(@RequestBody Task task){
        return repo.save(task);
    }

    @GetMapping("{/tasks}")
    public Iterable<Task> getAll(){
        return repo.findAll();
    }

    @GetMapping("{/tasks/{id}")
    public Task getById(@PathVariable Long id){
        return repo.findById(id).orElse(null);
    }
    
}
