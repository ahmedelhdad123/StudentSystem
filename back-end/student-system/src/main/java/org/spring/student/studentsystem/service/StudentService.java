package org.spring.student.studentsystem.service;

import org.spring.student.studentsystem.dao.StudentRepository;
import org.spring.student.studentsystem.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id)
    {
        return studentRepository.findById(id).get();
    }

    public Student addStudent(Student student){
       return studentRepository.save(student);
    }

    public Student editStudent(Student student)
    {
        return studentRepository.save(student);
    }

    public String deleteStudent(Long id)
    {
        studentRepository.findById(id);
        return "Done!";
    }
    public List<Student> findByFullName(String fullName)
    {
        return studentRepository.findByFullName(fullName);
    }
}
