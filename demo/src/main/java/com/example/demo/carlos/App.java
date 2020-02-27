package com.example.demo.carlos;


public class App {
    public static void main(String[] args) {
        Company co = new Company();

        System.out.println(co.getAddress().getNumber());
        System.out.println(co.getAddress().getStreet());

        co.getAddress().setNumber(67);
        co.getAddress().setStreet("Medellin");

        System.out.println(co.getAddress().getNumber());
        System.out.println(co.getAddress().getStreet());

        co.carlos = "Hola carlos";
    }
}
