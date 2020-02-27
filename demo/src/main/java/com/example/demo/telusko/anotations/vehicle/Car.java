package com.example.demo.telusko.anotations.vehicle;

import org.springframework.stereotype.Component;

@Component// The default name is the class name in lower case.
public class Car implements IVehicle {
    Tyre tyre;
    public void drive(){
        System.out.println("Driving a car. with " + tyre);
    }
}
