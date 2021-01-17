package com.lllfff.controller;

import com.lllfff.entity.Student;
import com.lllfff.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Value("${server.port}")
    private String port;
    @GetMapping("/index")
    public String index(){
        return "当前端口:"+this.port;
    }
    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return studentService.findAll();
    }
    @GetMapping("/findByid/{id}")
    public Student findByid(@PathVariable("id") long id){
        return studentService.findById(id);
    }
    @PostMapping("/save")
    public void save(@RequestBody Student student){
        studentService.save(student);
    }
    @PutMapping("/update")
    public void update(@RequestBody Student student){
        studentService.save(student);
    }

    @DeleteMapping("/deleteByid/{id}")
    public void deleteByid(@PathVariable("id") long id){
        studentService.deleteByid(id);
    }
}
