package com.example.demo.telusko.xml;
import com.example.demo.telusko.xml.vehicle.IVehicle;
import com.example.demo.telusko.xml.vehicle.Tyre;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("spring.xml");

        IVehicle vehicle = (IVehicle) context.getBean("vehicle");
        vehicle.drive();

        IVehicle vehicle1 = (IVehicle) context.getBean("vehicle");
        vehicle1.setSpeed(15);


        IVehicle vehicle2 = (IVehicle) context.getBean("vehicle");

        vehicle2.drive();
        vehicle1.drive();
        vehicle.drive();


        Tyre t = (Tyre) context.getBean("tyre");
        System.out.println(t);
    }
}
