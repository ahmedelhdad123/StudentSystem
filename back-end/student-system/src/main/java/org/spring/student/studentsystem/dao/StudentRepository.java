package org.spring.student.studentsystem.dao;

import org.spring.student.studentsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

//@RepositoryRestResource
@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    // Search by Character to get All Word
    public List<Student> findByFullNameContaining(String fullName);

    // To Get Size Of Student In Database

    @Query("select count(id) from Student")
    public Long getStudentLength();
}
