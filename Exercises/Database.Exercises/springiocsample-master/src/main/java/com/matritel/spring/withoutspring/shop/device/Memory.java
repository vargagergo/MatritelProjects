package com.matritel.spring.withoutspring.shop.device;

public class Memory {
    private int size;
    private int frequency;

    public Memory(int size, int frequency) {
        this.size = size;
        this.frequency = frequency;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "size=" + size +
                ", frequency=" + frequency +
                '}';
    }
}
