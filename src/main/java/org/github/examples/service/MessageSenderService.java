package org.github.examples.service;

import org.github.examples.dto.EmployeeDTO;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MessageSenderService {
    @Autowired
    RabbitTemplate rabbitTemplate;

    @Value("${rabbitmq.exchange}")
    public String exchange;

    @Value("${rabbitmq.routingkey}")
    public String routingKey;

    public void send(EmployeeDTO employee){
        System.out.println("sending message to queue");
        rabbitTemplate.convertAndSend(exchange, routingKey, employee);
    }
}
