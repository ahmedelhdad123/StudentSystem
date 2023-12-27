package org.spring.student.studentsystem.dao;

import org.spring.student.studentsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//@RepositoryRestResource
@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    public List<Student> findByFullName(String fullName);
}
