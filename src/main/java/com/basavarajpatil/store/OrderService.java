package com.basavarajpatil.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private IPaymentService paymentService;

    @Autowired
    public OrderService(IPaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public OrderService() {}

    public void placeOrder() {
        paymentService.processPayment(108.23);
    }
}
