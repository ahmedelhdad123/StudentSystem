package org.spring.student.studentsystem.controller;

import org.spring.student.studentsystem.entity.Student;
import org.spring.student.studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
// localhost:8085/system
@RequestMapping("system/")
public class StudentController {


    private StudentService service;

    @Autowired
    public StudentController(StudentService service) {
        this.service = service;
    }

    // localhost:8085/system/students?page=0&size=4
    @GetMapping("students")
    public List<Student> getAllStudent(@RequestParam int page,@RequestParam int size){
        return service.getAllStudent(page, size);
    }
    // localhost:8085/system/student/id
    @GetMapping("student/{id}")
    public Student getStudentById(@PathVariable Long id)
    {
        return service.getStudentById(id);
    }

    // localhost:8085/system/students
    @PostMapping("students")
    public Student addStudent(@RequestBody Student student)
    {
       return service.addStudent(student);
    }

    // localhost:8085/system/students?id=
    @PutMapping("students")
    public Student editStudent(@RequestBody Student student,@RequestParam Long id)
    {
        student.setId(id);
        return service.addStudent(student);
    }

    // http://localhost:8085/system/students
    @DeleteMapping("students")
    public String deleteStudent(Long  id)
    {
        service.deleteStudent(id);
        return "Done!";
    }

    // http://localhost:8085/system/students/searchname?fullName= name
    @GetMapping("students/searchname")
    public List<Student> findByFullName(@RequestParam String fullName)
    {
        return service.findByFullName(fullName);
    }

    // http://localhost:8085/system/students/length
    @GetMapping("students/length")
    public Long getStudentLength()
    {
        return service.getStudentLength();
    }

    @GetMapping("students/lengthname")
    public int getStudentLengthByName(@RequestParam String name)
    {
        return  service.getStudentLengthByName(name);
    }
}
