package com.example.crudSpringBoot.service;

import com.example.crudSpringBoot.entity.Student;
import com.example.crudSpringBoot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student studentReq){
        //business logic here.
        Student studentResponse = studentRepository.save(studentReq);
        return studentResponse;

    }

    public Student getStudent(Long id){
       Optional<Student> studentFound = studentRepository.findById(id);
       if(! studentFound.isPresent()){
           return null;
       }
       return studentFound.get();
    }

    public List<Student> getListStudent(){
        List<Student> listStudent = studentRepository.findAll();
        return listStudent;
    }

    public Student updattingStudent(Long id,Student studentReq){
        Optional<Student> studentFind = studentRepository.findById(id);
        if(! studentFind.isPresent()){
            return null;
        }
        Student studentToUpdate = studentFind.get();
        studentToUpdate.setName(studentReq.getName());
        studentToUpdate.setRollNo(studentReq.getRollNo());
        studentToUpdate.setSubject(studentReq.getSubject());
        studentToUpdate.setEmail(studentReq.getEmail());
        studentToUpdate.setAge(studentReq.getAge());

        return studentRepository.save(studentToUpdate);
    }

    public boolean deleteStudent(Long id){
        boolean isStudent = studentRepository.existsById(id);
        if( ! isStudent){
            return false;
        }
        studentRepository.deleteById(id);
        return true;
    }
}
