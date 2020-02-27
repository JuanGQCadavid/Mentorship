package com.example.demo.telusko.xml.vehicle;


public class Tyre {
    private String brand;

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public Tyre(String brand) {
        this.brand = brand;
    }

    public Tyre(){}

    public String getBrand() {
        return brand;
    }



    @Override
    public String toString() {
        return "Tyre{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
