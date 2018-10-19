package br.com.mqmanager.sender.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.mqmanager.sender.component.OrderQueueSender;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value = "/orders")
@Slf4j
public class OrderController {

    @Autowired
    private OrderQueueSender orderQueueSender;

    @RequestMapping(method = RequestMethod.POST)
    public void send(@RequestBody String order) {
        orderQueueSender.send(order);
    }

}
