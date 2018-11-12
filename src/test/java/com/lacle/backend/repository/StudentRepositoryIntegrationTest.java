package com.lacle.backend.repository;

import com.lacle.backend.model.Room;
import com.lacle.backend.model.Student;
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
public class StudentRepositoryIntegrationTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void whenFindById_thenReturnRoom(){
        Student student = new Student("Romain", "DE-COSTER");
        Student savedStudent = entityManager.persist(student);

        Student foundStudent = studentRepository.getOne(savedStudent.getId());

        assertThat(foundStudent.getFirstName())
                .isEqualTo(student.getFirstName());

    }

}
