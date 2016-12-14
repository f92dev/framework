package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}

@SpringUI
class MyUI extends UI {
    public static final String NOTIFICATION_TEXT = "Thank you for clicking.";

    @Override
    protected void init(VaadinRequest request) {
        setContent(new Button("Click Me!",
                e -> Notification.show(NOTIFICATION_TEXT)));
    }
}
