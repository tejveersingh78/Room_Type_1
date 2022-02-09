package com.sunglowsys.service;

import com.sunglowsys.domain.Room_type;
import com.sunglowsys.repository.RoomTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomTypeServiceImpl implements RoomTypeService{

    @Autowired
    private RoomTypeRepository roomTypeRepository;


    @Override
    public Room_type createRoom_Type(Room_type room_type) {
        return roomTypeRepository.save(room_type);
    }

    @Override
    public Room_type update(Room_type room_type, Long id) {
        Room_type room_type1 = findById(id);
        if(room_type.getName() != null){
            room_type1.setName(room_type.getName());
        }
        return roomTypeRepository.save(room_type1);
    }

    @Override
    public List<Room_type> findAll() {
        return roomTypeRepository.findAll();
    }

    @Override
    public Room_type findById(Long id) {
        Optional<Room_type> optional = roomTypeRepository.findById(id);
        Room_type room_type = null;
        if(optional.isPresent()){
            room_type = optional.get();
        }
        else{
            throw new RuntimeException("RoomType not found for ID : " + id);
        }
        return room_type;

    }

    @Override
    public void delete(Long id) {
        roomTypeRepository.deleteById(id);

    }
}
