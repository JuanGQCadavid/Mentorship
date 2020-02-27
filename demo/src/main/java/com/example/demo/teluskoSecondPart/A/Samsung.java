package com.example.demo.teluskoSecondPart.A;

import org.springframework.beans.factory.annotation.Autowired;


public class Samsung {
    @Autowired
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
