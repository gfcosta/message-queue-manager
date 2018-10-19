package br.com.mqmanager.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import br.com.mqmanager.consumer.client.rest.RESTClient;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class OrderConsumer {

    @RabbitListener(queues = {"${queue.order.name}"})
    public void receive(@Payload String order) {
        //log.info("Order: " + order);
    	
    	// Recurso para estornar compra
		RESTClient rest = new RESTClient();
		rest.send(order);
    	
    }
}