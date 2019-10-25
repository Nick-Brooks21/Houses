package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import beans.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> { }

