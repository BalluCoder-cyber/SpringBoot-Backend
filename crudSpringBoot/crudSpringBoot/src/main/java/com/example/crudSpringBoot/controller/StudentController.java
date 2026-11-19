package com.example.crudSpringBoot.controller;

import com.example.crudSpringBoot.entity.Student;
import com.example.crudSpringBoot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students") // mapping api request..
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }


    @PostMapping("/create")
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        Student createdStudent = studentService.createStudent(student);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(createdStudent);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Long id){
        Student gettingStudent = studentService.getStudent(id);

        if(gettingStudent == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(gettingStudent); // sorter way of writing response
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Student>> AllStudent(){
        List<Student> getAllStudent = studentService.getListStudent();

        if(getAllStudent.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(getAllStudent); // sorter way of writing response
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long id,@RequestBody Student student){
        Student updatedStudent = studentService.updattingStudent(id,student);

        if(updatedStudent == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updatedStudent); // sorter way of writing response
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long id){
        boolean isDeleted = studentService.deleteStudent(id);
        if(! isDeleted){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok("Student Deleted");
    }

}
