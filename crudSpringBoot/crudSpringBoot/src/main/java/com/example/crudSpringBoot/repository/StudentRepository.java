package com.example.crudSpringBoot.repository;

import com.example.crudSpringBoot.entity.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentRepository {

    public Student saveStudent(Student studentReq){
        //Save to db

        System.out.println("Inside student Repository");
        System.out.println("Existing student Repository");

        Student s1 = new Student();
        s1.setName("Rahul");
        s1.setRollNo(1044);
        s1.setAge(44);
        s1.setEmail("balwsldg66@dgamai");
        s1.setSubject("springboot crud");

        return s1;

    }
}
