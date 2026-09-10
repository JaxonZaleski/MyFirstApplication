package com.zaleskjn.myfirst;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private PaymentService paymentService;


    public OrderService(@Qualifier("stripe") PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void PlaceOrder() {
//        var paymentService = new PaypalPaymentService();
        paymentService.ProcessPayment(100);
    }
}
