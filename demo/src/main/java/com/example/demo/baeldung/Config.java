package com.example.demo.baeldung;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = Company.class)
public class Config {

    @Bean("default-Addr") // Como es que estoy opteniendo un objeto de tipo Company si nunca fue setiado
    public Address crearDireccion(){
        return new Address ("High Street",1000);
    }
    /*
    @Bean("default-Addr2") // Como es que estoy opteniendo un objeto de tipo Company si nunca fue setiado
    public Address crearDireccion2(){
        return new Address ("Medellin",200);
    }

     */
}
