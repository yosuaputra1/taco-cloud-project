package com.example.tacocloud.messaging;

import com.example.tacocloud.domain.TacoOrder;

public interface OrderMessagingService {

    void sendOrder(TacoOrder order);
}
