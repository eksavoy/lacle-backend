package com.lacle.backend.controller;

import com.lacle.backend.model.Student;
import com.lacle.backend.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController implements DefaultController<Student> {

    @Autowired
    private StudentService service;

    @Override
    public List<Student> getAll() {
        return service.getAll();
    }

    @Override
    public Student get(Long id) {
        return service.get(id);
    }
}
