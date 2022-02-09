package com.sunglowsys.service;

import com.sunglowsys.domain.Room_type;

import java.util.List;

public interface RoomTypeService {

    Room_type createRoom_Type(Room_type room_type);

    Room_type update(Room_type room_type, Long id);

    List<Room_type> findAll();

    Room_type findById(Long id);

    void delete(Long id);
}
