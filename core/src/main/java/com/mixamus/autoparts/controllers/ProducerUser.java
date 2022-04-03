package com.mixamus.autoparts.controllers;

import com.mixamus.autoparts.dto.ClientDto;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ProducerUser {

    private final KafkaTemplate<String, ClientDto> kafkaTemplate;
    public static final String TOPIC_NAME = "kafka_example";

    @GetMapping("kafka/{message}")
    public String getPostString(@PathVariable("message") final String message) {
        return "Published successfully";
    }

    @GetMapping("kafka/json/{client}")
    public String getPostJson(@PathVariable("client") final String client) {
        kafkaTemplate.send(TOPIC_NAME, ClientDto.builder()
            .username(client)
            .firstname("Maxim")
            .lastname("Dokuchaev")
            .password("qwerty13")
            .phone("+19991311313")
            .build());
        return "Published successfully";
    }
}
