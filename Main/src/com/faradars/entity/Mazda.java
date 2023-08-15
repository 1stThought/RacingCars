package com.faradars.entity;

public class Mazda implements ICar {
    @Override
    public String getName() {
        return "Mazda";
    }

    @Override
    public int getSpeed() { return 0; }

    public void sample(){
        int i=1;
    }
}
