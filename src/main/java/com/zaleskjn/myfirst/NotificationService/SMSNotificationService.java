package com.zaleskjn.myfirst.NotificationService;

import org.springframework.stereotype.Service;

@Service ("sms")
public class SMSNotificationService implements NotificationService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
