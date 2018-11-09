package com.lacle.backend.controller.secured;

import com.lacle.backend.model.Student;
import com.lacle.backend.repository.StudentRepository;
import com.lacle.backend.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/secure/student")
public class StudentSecureController implements DefaultSecureController<Student> {

    @Autowired
    private StudentService service;

    @Override
    public Student create(Student object) {
        return service.create(object);
    }

    @Override
    public Student update(Student object) {
        return service.update(object);
    }

    @Override
    public void delete(Student object) {
        service.delete(object);
    }

    @Override
    public void delete(Long id) {
        service.delete(id);
    }
}
