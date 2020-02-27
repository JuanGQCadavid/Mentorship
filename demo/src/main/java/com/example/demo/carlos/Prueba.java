package com.example.demo.carlos;

public class Prueba {
    private String atr1;
    private String atr2;

    public Prueba(String atr1, String atr2){
        this.atr1 = atr1;
        this.atr2 = atr2;
    }

    @Override
    public String toString() {
        return "Prueba{" +
                "atr1='" + atr1 + '\'' +
                ", atr2='" + atr2 + '\'' +
                '}';
    }
}
