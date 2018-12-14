package com.matritel.spring.withspring.shop.device;

public class Storage {

    private String type;
    private int size;

    public Storage(String type, int size) {
        this.type = type;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "type='" + type + '\'' +
                ", size=" + size +
                '}';
    }
}
