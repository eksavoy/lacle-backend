package com.lacle.backend.repository;

import com.lacle.backend.CustomTest;
import com.lacle.backend.model.Room;
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
public class RoomRepositoryIntegrationTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private RoomRepository roomRepository;

    @Test
    public void whenFindById_thenReturnRoom(){
        Room room = new Room(1);
        Room saveRoom = entityManager.persist(room);

        Room findRoom = roomRepository.findById(saveRoom.getId()).orElseThrow();

        assertThat(findRoom.getNumber())
                .isEqualTo(saveRoom.getNumber());

    }

}
