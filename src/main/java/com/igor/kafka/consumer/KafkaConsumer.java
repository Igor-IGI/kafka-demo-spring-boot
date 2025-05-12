package com.igor.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * @author Igor Popovic
 */
@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "igor", groupId = "myGroup")
    public void consumeMessage(String message) {
        log.info("Consumed message: {}", message);
    }
}
