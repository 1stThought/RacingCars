package com.faradars.entity;

public class Benz implements ICar {
    public static final String NAME="Beniiiz   ";
    public static final int MAX_SPEED =150;

    public String getName(){
        return NAME;
    }

    @Override
    public int getSpeed() {
        return MAX_SPEED;
    }
}
