package com.lacle.backend.repository;

import com.lacle.backend.model.Student;
import com.lacle.backend.model.Teacher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@ActiveProfiles("test")
@DataJpaTest
public class TeacherRepositoryIntegrationTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    public void whenFindById_thenReturnRoom(){
        Teacher teacher = new Teacher("Romain", "DE-COSTER");

        Teacher savedTeacher = entityManager.persist(teacher);

        Teacher found = teacherRepository.getOne(savedTeacher.getId());

        assertThat(found.getFirstName())
                .isEqualTo(teacher.getFirstName());

    }

}
