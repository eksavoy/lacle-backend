package com.lacle.backend.repository;

import com.lacle.backend.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface RoomRepository extends JpaRepository<Room, Long> {

    public Optional<Room> findByNumber(Integer number);
}
