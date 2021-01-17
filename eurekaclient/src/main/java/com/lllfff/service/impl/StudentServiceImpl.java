package com.lllfff.service.impl;

import com.lllfff.entity.Student;
import com.lllfff.service.StudentService;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Repository
public class StudentServiceImpl implements StudentService {
   private  static Map<Long,Student> studentMap;

   static {
       studentMap=new HashMap<>();
       studentMap.put(1L,new Student(1L,"张三",22));
       studentMap.put(2L,new Student(2L,"李四",23));
       studentMap.put(3L,new Student(3L,"王五",24));
   }
    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(long id) {
        return studentMap.get(id);
    }

    @Override
    public void save(Student student) {
            studentMap.put(student.getId(),student);
    }

    @Override
    public void deleteByid(long id) {
         studentMap.remove(id);
    }
}
