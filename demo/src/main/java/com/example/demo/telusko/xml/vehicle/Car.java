package com.example.demo.telusko.xml.vehicle;

public class Car implements IVehicle {

    private int speed;
    public void drive(){
        System.out.println("Driving a Car at speed ->" + speed);
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed= speed;
    }

}
