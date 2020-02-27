package com.example.demo.baeldung;

import org.springframework.stereotype.Component;

@Component()
public class Company {
    private Address address;
    private String carlos;

    public Company(Address address){
        this.address=address;
    }

    public void setCarlos(Integer newInt){
        newInt= newInt * 2 ;
        System.out.println("Integer -> " + newInt);
        newInt = new Integer(4);
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
