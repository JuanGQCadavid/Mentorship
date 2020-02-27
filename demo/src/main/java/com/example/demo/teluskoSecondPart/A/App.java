package com.example.demo.teluskoSecondPart.A;


import com.example.demo.teluskoSecondPart.A.AppConfig;
import com.example.demo.teluskoSecondPart.A.Samsung;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        Samsung s7 = factory.getBean(Samsung.class);
        s7.config();
    }
}
