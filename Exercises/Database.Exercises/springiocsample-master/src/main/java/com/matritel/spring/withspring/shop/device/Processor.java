package com.matritel.spring.withspring.shop.device;

public class Processor {

    private int core;
    private int frequency;

    public Processor(int core, int frequency) {
        this.core = core;
        this.frequency = frequency;
    }

    public int getCore() {
        return core;
    }

    public void setCore(int core) {
        this.core = core;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "core=" + core +
                ", frequency=" + frequency +
                '}';
    }
}
