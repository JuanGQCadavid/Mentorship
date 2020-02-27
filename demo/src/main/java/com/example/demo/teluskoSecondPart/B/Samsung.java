package com.example.demo.teluskoSecondPart.B;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component("mySamsung")
public class Samsung {

    @Autowired
    @Qualifier("mediaTek")
    MobileProcessor cpu;

    public void config()
    {
        System.out.println("Octa core, 4 gb Ram, 12Mp camera");
        cpu.processor();
    }

    public MobileProcessor getCpu() {
        return cpu;
    }

    public void setCpu(MobileProcessor cpu) {
        this.cpu = cpu;
    }
}
