package com.example.crudSpringBoot.service;

import com.example.crudSpringBoot.entity.Student;
import com.example.crudSpringBoot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student studentReq){
        //business logic here.

        System.out.println("Inside student Service");
        Student studentResponse = studentRepository.saveStudent(studentReq);
        System.out.println("existing student Service");

        return studentResponse;

    }
}
