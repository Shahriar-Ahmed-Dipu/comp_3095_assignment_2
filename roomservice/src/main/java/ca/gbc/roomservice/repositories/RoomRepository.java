package ca.gbc.roomservice.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import ca.gbc.roomservice.models.Room;
import java.util.List;

public interface RoomRepository extends JpaRepository<Room, Long> {
    List<Room> findByAvailability(boolean availability);
}