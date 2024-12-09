package ca.gbc.eventservice;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaEventListener {

    @KafkaListener(topics = "your-topic-name", groupId = "your-consumer-group")
    public void listen(String message) {
        // Logic to handle the incoming Kafka message
        System.out.println("Received message: " + message);
    }
}
