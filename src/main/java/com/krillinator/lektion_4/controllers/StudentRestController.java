package com.krillinator.lektion_4.controllers;

import com.krillinator.lektion_4.models.Student;
import com.krillinator.lektion_4.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentRestController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // URL -> localhost:8080/api/saveStudent
    @PostMapping("/saveStudent")
    public ResponseEntity<Student> saveStudent(@RequestBody Student student) {

        // TODO - CHECK IF NULL, CHECK VALUES

        studentRepository.save(student);

        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

}

