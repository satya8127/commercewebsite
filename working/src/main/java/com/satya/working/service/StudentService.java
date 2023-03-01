package com.satya.working.service;


import com.satya.working.entity.Student;
import com.satya.working.payload.request.StudentRequest;
import com.satya.working.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
     private StudentRepository repo;

    public Student getStudentById(long studentId) {
        Student student=repo.findById(studentId).orElseThrow();
                //.orElseThrow(() -> )
        return student;
    }

    public long saveStudent(StudentRequest studentRequest) {
Student student=Student.builder().name(studentRequest.getName()).section(studentRequest.getSection()).
        build();
student=repo.save(student);
        return student.getStudentId();
    }
}
