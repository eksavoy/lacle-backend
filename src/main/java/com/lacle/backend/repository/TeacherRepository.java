package com.lacle.backend.repository;

import com.lacle.backend.model.Teacher;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TeacherRepository extends PagingAndSortingRepository<Teacher, Long> {
}
