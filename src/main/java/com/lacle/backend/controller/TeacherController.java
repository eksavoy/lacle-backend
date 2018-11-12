package com.lacle.backend.controller;

import com.lacle.backend.model.Teacher;
import com.lacle.backend.repository.TeacherRepository;
import com.lacle.backend.service.teacher.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/teacher")
public class TeacherController implements DefaultController<Teacher> {

    @Autowired
    private TeacherService service;

    @Override
    public List<Teacher> getAll() {
        return service.getAll();
    }

    @Override
    public Teacher get(Long id) {
        return service.get(id);
    }
}
