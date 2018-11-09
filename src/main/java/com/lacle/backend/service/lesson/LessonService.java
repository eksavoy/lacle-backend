package com.lacle.backend.service.lesson;

import com.lacle.backend.model.Lesson;
import com.lacle.backend.service.DefaultService;

import java.time.Instant;
import java.util.List;

public interface LessonService extends DefaultService<Lesson> {

    List<Lesson> findAllBetweenDate(Instant start, Instant end);

}
