package com.example.tacocloudkitchen;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KitchenUI {

    public void displayOrder(TacoOrder order){
        log.info("RECEIVED ORDER: {}", order);
    }
}
