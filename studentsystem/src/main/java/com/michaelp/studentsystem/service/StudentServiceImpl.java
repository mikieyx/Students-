package com.michaelp.studentsystem.service;

import com.michaelp.studentsystem.model.Student;
import com.michaelp.studentsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
This class implements the StudentService interface. This class is a part
the service layer that handles business Logic
 */
@Service
public class StudentServiceImpl implements StudentService {


    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
