package com.lacle.backend.controller.secured;

import com.lacle.backend.model.Room;
import com.lacle.backend.service.room.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/secured/room")
public class RoomControllerSecured  implements DefaultSecureController<Room>{

    @Autowired
    private RoomService roomService;

    @Override
    public Room create(Room object) {
        return roomService.create(object);
    }

    @Override
    public Room update(Room object) {
        return roomService.update(object);
    }

    @Override
    public void delete(Room object) {
        roomService.delete(object);
    }

    @Override
    public void delete(Long id) {
        roomService.delete(id);
    }
}
