package com.example.demo.telusko.anotations;
import com.example.demo.telusko.anotations.vehicle.IVehicle;

import com.example.demo.telusko.anotations.vehicle.Tyre;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_anotations.xml");

        IVehicle obj = (IVehicle) context.getBean("bike");
        obj.drive();

        Tyre tyre = (Tyre) context.getBean("tyre");
        System.out.println(tyre.toString());
    }
}
