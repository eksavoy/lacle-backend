package com.lacle.backend.controller.secured;

import com.lacle.backend.model.Lesson;
import com.lacle.backend.service.lesson.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/secure/lesson")
public class LessonSecureController implements DefaultSecureController<Lesson> {

    @Autowired
    private LessonService service;

    @Override
    public Lesson create(Lesson object) {
        return service.create(object);
    }

    @Override
    public Lesson update(Lesson object) {
        return service.update(object);
    }

    @Override
    public void delete(Lesson object) {
        service.delete(object);
    }

    @Override
    public void delete(Long id) {
        service.delete(id);
    }
}
