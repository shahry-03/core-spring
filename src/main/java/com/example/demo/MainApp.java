package com.example.demo;

import com.example.loose.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        // 1. Spring Container start karo aur XML file ka rasta do
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanContext.xml");

        // 2. Spring se apna Bean maango (XML wale id ke zariye)
        GreetingService greetingService = (GreetingService) context.getBean("myBean");

        // 3. Method chalao
        greetingService.sayHello();

        UserService userService = (UserService) context.getBean("userServiceSMS");

        userService.notifyHello("Whats' up");
    }
}
