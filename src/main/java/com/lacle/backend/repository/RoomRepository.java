package com.lacle.backend.repository;

import com.lacle.backend.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
