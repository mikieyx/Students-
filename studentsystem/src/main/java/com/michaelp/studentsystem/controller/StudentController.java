package com.michaelp.studentsystem.controller;


import com.michaelp.studentsystem.model.Student;
import com.michaelp.studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
Marks class as web request handler
 */
@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService studentService;

    //@postmapping Handle HTTP POST requests sent to the /add endpoint
    //Extract JSON payload from the request body
    //@reqbody will deserialize req body into student object
    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New student is added";
    }

    @GetMapping("/getAll")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

}
