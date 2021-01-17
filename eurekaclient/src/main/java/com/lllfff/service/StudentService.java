package com.lllfff.service;

import com.lllfff.entity.Student;

import java.util.Collection;

public interface StudentService {
    public Collection<Student> findAll();
    public Student findById(long id);
    public  void  save(Student student);
    public  void  deleteByid(long id);


}
