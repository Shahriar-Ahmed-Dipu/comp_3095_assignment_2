package ca.gbc.eventservice.repositories;


import org.springframework.data.mongodb.repository.MongoRepository;
import ca.gbc.eventservice.models.Event;

public interface EventRepository extends MongoRepository<Event, String> {
    // Additional query methods if needed
}
