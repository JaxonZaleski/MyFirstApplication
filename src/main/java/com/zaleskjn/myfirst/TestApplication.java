package com.zaleskjn.myfirst;

import com.zaleskjn.myfirst.NotificationService.NotificationManager;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TestApplication {

    public static void main(String[] args) {

        //region main variables
        var one = 0;
        var two = 0;
        var three = 0;
        //endregion

        ApplicationContext context = SpringApplication.run(TestApplication.class, args);

        var orderService = context.getBean((OrderService.class));
        orderService.PlaceOrder();

        orderService = new OrderService(new PaypalPaymentService());
        orderService.PlaceOrder();

        orderService = new OrderService(new StripePaymentService());
        orderService.PlaceOrder();

        var notificationManager = context.getBean((NotificationManager.class));
        notificationManager.sendMessage();

    }

}
