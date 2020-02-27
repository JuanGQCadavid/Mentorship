package com.example.demo.teluskoSecondPart.A;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig
{
    @Bean
    public Samsung getPhones()
    {
        return new Samsung();
    }

    @Bean
    public MobileProcessor getProcessor(){
        return  new Snapdragon();
    }

}
