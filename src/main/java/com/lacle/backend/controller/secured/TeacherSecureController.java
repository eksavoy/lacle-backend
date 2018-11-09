package com.lacle.backend.controller.secured;

import com.lacle.backend.model.Teacher;
import com.lacle.backend.service.teacher.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/secure/teacher")
public class TeacherSecureController implements DefaultSecureController<Teacher> {

    @Autowired
    private TeacherService service;

    @Override
    public Teacher create(Teacher object) {
        return service.create(object);
    }

    @Override
    public Teacher update(Teacher object) {
        return service.update(object);
    }

    @Override
    public void delete(Teacher object) {
        service.delete(object);
    }

    @Override
    public void delete(Long id) {
        service.delete(id);
    }
}
