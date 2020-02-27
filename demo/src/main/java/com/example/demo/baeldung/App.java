package com.example.demo.baeldung;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

public class App {
    final  ArrayList<String> arr = new ArrayList<>();

    public void pepe(){
        System.out.println("Hola");
    }

    public static void main(String[] args) {
        /*
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Company company = context.getBean("company", Company.class);

        System.out.println(company.getAddress().getStreet());
        System.out.println(company.getAddress().getNumber());

         */
        Company com = new Company(null);

        Integer test = 5;
        com.setCarlos(test);
        System.out.println(test);
    }
}
