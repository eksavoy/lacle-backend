package com.lacle.backend.controller;

import com.lacle.backend.model.Lesson;
import com.lacle.backend.service.lesson.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/lesson")
public class LessonController implements DefaultController<Lesson> {

    @Autowired
    private LessonService service;

    @Override
    public List<Lesson> getAll() {
        return service.getAll();
    }

    @Override
    public Lesson get(Long id) {
        return service.get(id);
    }
}
