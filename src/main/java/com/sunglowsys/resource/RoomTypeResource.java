package com.sunglowsys.resource;

import com.sunglowsys.domain.Room_type;
import com.sunglowsys.service.RoomTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RoomTypeResource {

    @Autowired
    private RoomTypeService roomTypeService;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody Room_type room_type){
        Room_type result = roomTypeService.createRoom_Type(room_type);
        return ResponseEntity.ok().body("Roomtype is Created Successfully : " + result);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Room_type> update(@RequestBody Room_type room_type,@PathVariable ("id") Long id ){
        Room_type result = roomTypeService.update(room_type,id);
        return ResponseEntity.ok().body(result);
    }

    @GetMapping("/roomtypes/{id}")
    public Room_type getById(@PathVariable("id") Long id){
        return roomTypeService.findById(id);
    }

    @GetMapping
    public List<Room_type> getAll(){
        List<Room_type> result1 = roomTypeService.findAll();
        return result1;
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id){
        roomTypeService.delete(id);
        return ResponseEntity.ok().body("RoomType is deleted Successfully on this Id : " + id);
    }
}
