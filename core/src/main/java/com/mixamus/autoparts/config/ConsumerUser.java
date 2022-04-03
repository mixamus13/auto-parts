package com.mixamus.autoparts.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import static com.mixamus.autoparts.controllers.ProducerUser.TOPIC_NAME;

@Component
public class ConsumerUser {

    private final Logger logger = LoggerFactory.getLogger(ConsumerUser.class);

    /**
     * <b>group.id</b> указывает name group consumers, к которой принадлежит потребитель Kafka.
     * <p></p>
     * Когда consumer Kafka создан, а group.id еще не существует (т.е. нет существующих
     * consumers, которые являются частью группы), группа consumers будет создана автоматически.
     * <p></p>
     * <b>Note:</b> Если все consumers в группе покидают группу, группа автоматически уничтожается.
     */
    @KafkaListener(topics = TOPIC_NAME, groupId = "shipping_group")
    public void listenForShipping(String message) {
        logger.info("This is my message from listenForShipping ---1---> {}", message);
    }

    /**
     * Если у consumers одинаковый groupId, то они будут читать один topic, каждый
     * будет распределен по partitions чтоб быстрее прочитать.
     * Принцип многопоточки. Как <b>ComparableFuture</b>.
     */
    @KafkaListener(topics = TOPIC_NAME, groupId = "notification_group")
    public void listenForNotification(String message) {
        logger.info("This is my message from listenForNotification ---2---> {}", message);
    }

    @KafkaListener(topics = TOPIC_NAME, groupId = "notification_group")
    public void listenForOne(String message) {
        logger.info("This is my message from listenForOne ---2---> {}", message);
    }

    @KafkaListener(topics = TOPIC_NAME, groupId = "notification_group")
    public void listenForTwo(String message) {
        logger.info("This is my message from listenForTwo ---2---> {}", message);
    }
}
