package com.example.demo.telusko.anotations.vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bike implements IVehicle {
    @Autowired
    Tyre tyre;
    public void drive(){
        System.out.println("Driving a bike with" + tyre);
    }
}
