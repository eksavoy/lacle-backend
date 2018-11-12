package com.lacle.backend.service.student;

import com.lacle.backend.exception.RessourceNotFoundException;
import com.lacle.backend.model.Student;
import com.lacle.backend.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    @Transactional(readOnly = true)
    public Student get(String name) {
        return null;
    }

    @Override
    @Transactional(readOnly = true)
    public Student get(Long id) {
        return studentRepository.getOne(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Student> getAll() {
        List<Student> students = new LinkedList<>();
        studentRepository.findAll().iterator().forEachRemaining(students::add);
        return students;
    }

    @Override
    @Transactional
    public Student create(@Valid Student object) {
        return studentRepository.save(object);
    }

    @Override
    @Transactional
    public Student update(@Valid Student object) {
        return studentRepository.save(object);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    @Transactional
    public void delete(@Valid Student object) {
        studentRepository.delete(object);
    }
}
