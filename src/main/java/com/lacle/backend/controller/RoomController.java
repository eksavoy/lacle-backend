package com.lacle.backend.controller;

import com.lacle.backend.model.Room;
import com.lacle.backend.service.room.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/room")
public class RoomController implements DefaultController<Room> {

    @Autowired
    private RoomService roomService;


    @Override
    public List<Room> getAll() {
        return roomService.getAll();
    }

    @Override
    public Room get(Long id) {
        return roomService.get(id);
    }

    @GetMapping(value = "/search", produces = MediaType.APPLICATION_JSON_VALUE)
    public Room getByNumber(@RequestParam(name = "number", required = true) Integer number){
        return roomService.findByNumber(number);
    }
}
