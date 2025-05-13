package com.basavarajpatil.store;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service

public class StripePaymentService implements IPaymentService {

    @Override
    public void processPayment(double amount) {
        System.out.println("STRIPE");
        System.out.println("Amount: " + amount);

    }
}
