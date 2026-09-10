package com.zaleskjn.myfirst.NotificationService;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service ("email")
public class EmailNotificationService implements NotificationService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending Email: " + message);
    }
}
