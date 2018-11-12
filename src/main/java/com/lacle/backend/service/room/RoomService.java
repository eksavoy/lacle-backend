package com.lacle.backend.service.room;

import com.lacle.backend.model.Room;
import com.lacle.backend.service.DefaultService;

public interface RoomService extends DefaultService<Room> {

    public Room findByNumber(Integer number);
}
