package org.github.examples.service;

import org.github.examples.dto.EmployeeDTO;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "${rabbitmq.queue}")
public class MessageReceiverService {

    @RabbitHandler
    public void recievedMessage(EmployeeDTO e) {
        System.out.println("Recieved Message From RabbitMQ: " + e.getName());
    }
}
