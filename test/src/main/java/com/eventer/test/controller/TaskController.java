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

    @GetMapping("/tasks")
    public Iterable<Task> getAll(){
        return repo.findAll();
    }

    @GetMapping("/tasks/{id}")
    public Task getById(@PathVariable Long id){
        return repo.findById(id).orElse(null);
    }

    @PutMapping("/tasks/{id}")
    public Task update(@RequestBody Task task, @PathVariable Long id){
        task.setId(id);
        return repo.save(task);
    }

    @DeleteMapping("/tasks/{id}")
    public void delete(@PathVariable Long id){
        repo.deleteById(id);
    }

    @PatchMapping("/tasks/{id}")
    public void patchMethod(@PathVariable Long id, @RequestBody Task task){
        if (task.isDone())
            repo.markAsDone(id);
    }

    @PatchMapping("/tasks/{id}:mark-as-done")
    public void patchMethod(@PathVariable Long id){
        repo.markAsDone(id);
    }
    
}
