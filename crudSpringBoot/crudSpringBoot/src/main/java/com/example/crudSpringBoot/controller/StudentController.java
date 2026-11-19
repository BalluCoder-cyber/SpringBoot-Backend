package com.example.crudSpringBoot.controller;

import com.example.crudSpringBoot.entity.Student;
import com.example.crudSpringBoot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students") // mapping api request..
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }


    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student){
        System.out.println("Inside student Controller");
        Student createdStudent = studentService.createStudent(student);
        System.out.println("existing student controller student Controller");

        return createdStudent;

    }

}
