package com.faradars.entity;

public class Benz implements ICar {
    public static final String NAME="Benz   ";
    public static final int MAX_SPEED =290;

    public String getName(){
        return NAME;
    }

    @Override
    public int getSpeed() {
        return MAX_SPEED;
    }
}
