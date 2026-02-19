package com.example.loose;

public class UserService {
    public NotificationService notificationService;
    public UserService(){

    }
    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyHello(String message){
        notificationService.send("Hello, " + message);
    }
}
