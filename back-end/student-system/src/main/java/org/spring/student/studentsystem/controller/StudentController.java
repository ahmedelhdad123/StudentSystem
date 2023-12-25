package org.spring.student.studentsystem.controller;

import org.spring.student.studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {


    private StudentService service;

    @Autowired
    public StudentController(StudentService service) {
        this.service = service;
    }
}
