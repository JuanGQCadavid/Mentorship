package com.example.demo.telusko.xml.vehicle;

public class Bike implements IVehicle {
    private int speed;

    public Bike(){
        speed=0;
    }

    public void drive(){

        System.out.println("Driving a bike at speed ->" + speed);
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
