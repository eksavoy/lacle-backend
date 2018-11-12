package com.lacle.backend.service.room;

import com.lacle.backend.exception.RessourceNotFoundException;
import com.lacle.backend.model.Room;
import com.lacle.backend.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedList;
import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomRepository roomRepository;

    @Override
    @Transactional(readOnly = true)
    public Room get(Long id) {
        return roomRepository.findById(id).orElseThrow(() -> new RessourceNotFoundException("Room", "Id", id));
    }

    @Override
    @Transactional(readOnly = true)
    public List<Room> getAll() {
        List<Room> rooms = new LinkedList<>();
        roomRepository.findAll().iterator().forEachRemaining(rooms::add);
        return rooms;
    }

    @Override
    @Transactional
    public Room create(Room object) {
        return roomRepository.save(object);
    }

    @Override
    @Transactional
    public Room update(Room object) {
        return roomRepository.save(object);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        roomRepository.deleteById(id);
    }

    @Override
    @Transactional
    public void delete(Room object) {
        roomRepository.delete(object);
    }
}
