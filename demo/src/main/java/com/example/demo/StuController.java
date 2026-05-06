package com.example.demo;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/student")
public class StuController {
    @Autowired
    private StudentService service;
    @PostMapping
    public StuMAnEntity addStudent( @Valid  @RequestBody StuMAnEntity stu){
        return service.addstudents(stu);
    }
    @GetMapping
    public List<StuMAnEntity> getStudents(){
        return service.getall();
    }
    @GetMapping("/{id}")
    public StuMAnEntity getid( @PathVariable Long id){
     return service.getbyid(id);
    }
    @PutMapping("/{id}")
    public StuMAnEntity update(@PathVariable Long id,@Valid @RequestBody  StuMAnEntity st){
     return service.update(id,st);
    }
    @DeleteMapping("/{id}")
    public String delete( @PathVariable Long id){
        return service.delete(id);
    }
}
