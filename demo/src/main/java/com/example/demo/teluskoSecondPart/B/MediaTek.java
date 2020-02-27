package com.example.demo.teluskoSecondPart.B;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MediaTek implements MobileProcessor {

    @Override
    public void processor() {
        System.out.println("2nd Best cpu");
    }
}
