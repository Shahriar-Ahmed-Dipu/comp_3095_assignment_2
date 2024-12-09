package ca.gbc.bookingservice.repositories;
import org.springframework.data.mongodb.repository.MongoRepository;
import ca.gbc.bookingservice.models.Booking;

public interface BookingRepository extends MongoRepository<Booking, String> {
    // Additional query methods if needed
}
