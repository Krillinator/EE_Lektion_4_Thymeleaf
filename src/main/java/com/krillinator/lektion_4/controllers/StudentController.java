package com.krillinator.lektion_4.controllers;

import com.krillinator.lektion_4.models.Student;
import com.krillinator.lektion_4.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class StudentController {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/studentDb")
    public String studentDbPage(Model model) {

        return "student-db-page";
    }

    @GetMapping
    public String studentPage(Model model) {

        // Instantiate object
        Student student = new Student(
                "Benny",
                15,
                true
        );

        // Pass Model to View
        model.addAttribute("myStudent",student);

        // Add array to MODEL
        model.addAttribute("studentList",
                Arrays.asList(
                        new Student("StudentA", 15, true),
                        new Student("StudentB", 25, false),
                        new Student("StudentC", 35, true)
                )
        );

        return "student-page.html";
    }

}
