package com.zaleskjn.myfirst.NotificationService;

import com.zaleskjn.myfirst.PaymentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("notiManager")
public class NotificationManager {
    private NotificationService emailMessage;
    private NotificationService smsMessage;

    public NotificationManager(NotificationService emailMessage, @Qualifier("sms") NotificationService smsMessage) {
        this.emailMessage = emailMessage;
        this.smsMessage = smsMessage;
    }

    public void sendMessage() {
        emailMessage.sendMessage("This is an email message");

        emailMessage.sendMessage("This is an sms message");
    }
}
