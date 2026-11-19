package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		//ApplicationContext context =
				SpringApplication.run(DemoApplication.class, args);

		// we don't need to this because we hava runner class
//		OrderService orderService = context.getBean(OrderService.class);
//		orderService.placeOrder();
//
//
//		PaymentGateway paymentGateway = context.getBean(PaymentGateway.class);

//		Method 1 to provide value, generally it is not used in spring boot
//		paymentGateway.setType("phonepay");
//		paymentGateway.setRetryCount(3);





	}

}
