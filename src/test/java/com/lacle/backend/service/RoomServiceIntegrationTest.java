package com.lacle.backend.service;

import com.lacle.backend.model.Room;
import com.lacle.backend.repository.RoomRepository;
import com.lacle.backend.service.room.RoomService;
import com.lacle.backend.service.room.RoomServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.LinkedList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
public class RoomServiceIntegrationTest {

    @TestConfiguration
    static class RoomServiceImplTestContextConfiguration {
        @Bean
        public RoomService roomService(){
            return new RoomServiceImpl();
        }
    }

    @Autowired
    private RoomService roomService;

    @MockBean
    private RoomRepository roomRepository;

    @Before
    public void setUp(){
        List<Room> rooms = new LinkedList<>();
        Room room = new Room(1);
        ((LinkedList<Room>) rooms).push(room);

        Mockito.when(roomRepository.findAll())
                .thenReturn(rooms);
    }

    @Test
    public void whenGetAll_thenSizeIsOne(){
        List<Room> rooms = roomService.getAll();

        assertThat(rooms.size())
                .isEqualTo(1);
    }
}
