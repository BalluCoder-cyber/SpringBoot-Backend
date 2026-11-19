package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoRunner implements ApplicationRunner {
    private PaymentGateway paymentGateway;
    private OrderService orderService;

    @Autowired
    public DemoRunner(PaymentGateway paymentGateway,OrderService orderService){
        this.paymentGateway = paymentGateway;
        this.orderService = orderService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception{
        paymentGateway.print();
        orderService.placeOrder();
    }
}
