package com.lacle.backend.service.student;

import com.lacle.backend.model.Student;
import com.lacle.backend.service.DefaultService;

public interface StudentService extends DefaultService<Student> {

    Student get(String name);
}
