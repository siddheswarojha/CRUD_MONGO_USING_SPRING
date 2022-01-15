package com.sid.crud_mongodb.Controller;


import com.sid.crud_mongodb.Model.Student;
import com.sid.crud_mongodb.Repository.StudentRepository;
import com.sid.crud_mongodb.views.StudentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/student")
public class MyController {


    @Autowired
    StudentRepository studentRepository;

    @PostMapping("/")
    public ResponseEntity<?> addStudent(@RequestBody Student student)
    {
        Student s=  this.studentRepository.save(student);

        return ResponseEntity.ok(s);

    }

    @GetMapping("/")
    public List<StudentResponse> getStudent()
    {
        List<Student> students = studentRepository.findAll();
        List<StudentResponse> responses = new ArrayList<>();
        for (Student student:students){
            StudentResponse studentResponse = new StudentResponse(student);
            responses.add(studentResponse);
        }
        return responses;
        //return  studentRepository.findAll().stream().map(StudentResponse::new).collect(Collectors.toList());

    }



}
