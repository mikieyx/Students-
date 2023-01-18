package com.michaelp.studentsystem.repository;

import com.michaelp.studentsystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
@Repository annotation indicates that this class will provide
the mechanism for storage, retrieval, update, delete and search
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
