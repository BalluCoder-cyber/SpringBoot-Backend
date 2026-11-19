package com.example.demo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PaymentGateway {

//    @Value("${paymentGateway.type}")
//    private String type;
//    @Value("${paymentGateway.retryCount}")
//    private int retryCount;

    //for providing value to  type and retryCount;
//    public PaymentGateway( @Value("${paymentGateway.type}") String type,
//                           @Value("${paymentGateway.retryCount}") int retryCount){
//        this.type = type;
//        this.retryCount = retryCount;
//    }



    // this way is used to passing values

    private PaymentProperties paymentProperties;

   public PaymentGateway (PaymentProperties paymentProperties){
       this.paymentProperties = paymentProperties;
   }

   public String getType(){
       return paymentProperties.getType();
   }
   public int getTimeout(){
       return paymentProperties.getTimeout();
   }
   public boolean isEnable(){
       return paymentProperties.isEnable();
   }
   public int maxRetry(){
       return paymentProperties.getRetryCount();
   }

   public void print (){
       System.out.println(getType());
       System.out.println(getTimeout());
       System.out.println(maxRetry());
       System.out.println(isEnable());
   }
}
