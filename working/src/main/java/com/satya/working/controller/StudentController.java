package com.satya.working.controller;

import com.satya.working.entity.Student;
import com.satya.working.payload.request.StudentRequest;
import com.satya.working.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;
    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable("id") long studentId){
        Student student1=studentService.getStudentById(studentId);
        return new ResponseEntity<>(student1, HttpStatus.OK);
    }
    @PostMapping("/save")
    public  ResponseEntity<Long> saveStudent(@RequestBody StudentRequest studentRequest){
        long  studentId=studentService.saveStudent(studentRequest);
        return  new ResponseEntity<>(studentId,HttpStatus.CREATED);
    }
}
