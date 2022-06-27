package com.example.tacocloudkitchen;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class OrderListener {

    private final KitchenUI ui;

    @Autowired
    public OrderListener(KitchenUI ui){
        this.ui = ui;
    }

    @KafkaListener(topics = "tacocloud.orders.topic")
    public void handle(TacoOrder order, ConsumerRecord<String, TacoOrder> record){
        log.info("Received from partition {} with timestamp {}",
                record.partition(), record.timestamp());
        ui.displayOrder(order);
    }
}
