package com.mixamus.autoparts.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import static com.mixamus.autoparts.controllers.UserResource.TOPIC_NAME;

@Component
@Slf4j
public class ConsumerListener {

    @KafkaListener(topics = TOPIC_NAME, groupId = "kafka_example")
    public void listen(String message) {
        log.info("This is my message from KafkaListener ---> " + message);
    }
}
