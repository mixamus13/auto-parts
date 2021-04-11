package com.mixamus.autoparts.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import static com.mixamus.autoparts.controllers.UserResource.TOPIC_NAME;

@Component
@Slf4j
public class ConsumerListener {

    @KafkaListener(topics = TOPIC_NAME, groupId = "kafka_example_one")
    public void listenForOrder(String message) {
        log.info("This is my message from KafkaListener ---1---> " + message);
    }

    @KafkaListener(topics = TOPIC_NAME, groupId = "kafka_example_two")
    public void listenForClient(String message) {
        log.info("This is my message from KafkaListener ---2---> " + message);
    }
}
