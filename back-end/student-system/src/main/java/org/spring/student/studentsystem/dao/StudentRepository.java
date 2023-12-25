package org.spring.student.studentsystem.dao;

import org.spring.student.studentsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

//@RepositoryRestResource
@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}
