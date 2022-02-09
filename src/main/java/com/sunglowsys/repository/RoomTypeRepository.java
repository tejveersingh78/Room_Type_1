package com.sunglowsys.repository;

import com.sunglowsys.domain.Room_type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomTypeRepository extends JpaRepository<Room_type,Long>{
}
