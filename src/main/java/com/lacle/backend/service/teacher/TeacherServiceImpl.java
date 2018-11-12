package com.lacle.backend.service.teacher;

import com.lacle.backend.exception.RessourceNotFoundException;
import com.lacle.backend.model.Teacher;
import com.lacle.backend.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.Valid;
import java.util.LinkedList;
import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    @Transactional(readOnly = true)
    public Teacher get(Long id) {
        return teacherRepository.findById(id).orElseThrow(() -> new RessourceNotFoundException("Teacher", "ID", id));
    }

    @Override
    @Transactional(readOnly = true)
    public List<Teacher> getAll() {
        List<Teacher> teachers = new LinkedList<>();
        teacherRepository.findAll().iterator().forEachRemaining(teachers::add);
        return teachers;
    }

    @Override
    @Transactional
    public Teacher create(@Valid Teacher object) {
        return teacherRepository.save(object);
    }

    @Override
    @Transactional
    public Teacher update(@Valid Teacher object) {
        return teacherRepository.save(object);
    }

    @Override
    @Transactional
    public void delete(@Valid Long id) {
        teacherRepository.deleteById(id);
    }

    @Override
    public void delete(@Valid Teacher object) {
        teacherRepository.delete(object);
    }
}
