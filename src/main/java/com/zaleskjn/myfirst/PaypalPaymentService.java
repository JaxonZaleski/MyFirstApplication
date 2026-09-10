package com.zaleskjn.myfirst;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service("paypal")
public class PaypalPaymentService implements PaymentService {
    @Override
    public void ProcessPayment(double amount) {
        System.out.println("PAYPAL");
        System.out.println("Amount: " + amount);;
    }
}
