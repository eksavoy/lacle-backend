package com.lacle.backend.service.lesson;

import com.lacle.backend.exception.RessourceNotFoundException;
import com.lacle.backend.model.Lesson;
import com.lacle.backend.repository.LessonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.LinkedList;
import java.util.List;

@Service
public class LessonServiceImpl implements LessonService {

    @Autowired
    private LessonRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<Lesson> findAllBetweenDate(Instant start, Instant end) {
        return repository.findAllByStartDateBetween(start, end);
    }

    @Override
    @Transactional(readOnly = true)
    public Lesson get(Long id) {
        return repository.findById(id).orElseThrow(() -> new RessourceNotFoundException("Lesson", "Id", id));
    }

    @Override
    public List<Lesson> getAll() {
        List<Lesson> tmpLessons = new LinkedList<>();
        repository.findAll().iterator().forEachRemaining(tmpLessons::add);
        return tmpLessons;
    }

    @Override
    @Transactional
    public Lesson create(Lesson object) {
        return repository.save(object);
    }

    @Override
    @Transactional
    public Lesson update(Lesson object) {
        return repository.save(object);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void delete(Lesson object) {
        repository.delete(object);
    }
}
