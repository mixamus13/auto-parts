package com.mixamus.autoparts.controllers;

import com.mixamus.autoparts.domain.Part;
import com.mixamus.autoparts.service.CheckOrderNumberService;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("check/")
public class CheckOrderIDNumber {

  private final KafkaTemplate<String, String> kafkaTemplate;
  private final CheckOrderNumberService checkOrderNumberService;
  private static final String TOPIC = "kafka_example";

  @GetMapping("number/")
  public List<Part> getOrderByIdAvailablePart(@Valid @RequestParam String numberorder) {
    kafkaTemplate.send(TOPIC, numberorder);
    return checkOrderNumberService.getMissingPartsByOrder(numberorder);
  }
}
