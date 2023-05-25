package com.springkafka.demo.message;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "EconmerceCliente", groupId = "ecommerce-groupId")
    public void consumer(String message) {
        System.out.println(message);
    }
}
