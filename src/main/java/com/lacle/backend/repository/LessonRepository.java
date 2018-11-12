package com.lacle.backend.repository;

import com.lacle.backend.model.Lesson;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.time.Instant;
import java.util.List;

public interface LessonRepository extends PagingAndSortingRepository<Lesson, Long> {

    List<Lesson> findAllByStartDateBetween(Instant start, Instant end);

}
