package com.example.demo.carlos;



public class Company {
    private final Address address = new Address("Bogota", 57);
    public String carlos;

    public Company(){

    }

    public void setCarlos(Integer newInt){
        newInt= newInt * 2 ;
        System.out.println("Integer -> " + newInt);
        newInt = new Integer(4);
    }

    public Address getAddress() {
        return address;
    }

    /*public void setAddress(Address address) {
        this.address = address;
    }

     */
}
