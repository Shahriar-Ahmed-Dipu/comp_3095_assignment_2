package ca.gbc.eventservice;


import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "booking-topic", groupId = "group_id")
    public void consumeBookingEvent(String message) {
        System.out.println("Consumed event: " + message);
    }
}
