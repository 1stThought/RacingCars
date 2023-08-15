package com.faradars.entity;

public class Ferrari implements ICar {
    public static final String NAME="Ferrari";
    public static final int MAX_SPEED =300;

    public String getName(){
        return NAME;
    }

    @Override
    public int getSpeed() {
        return MAX_SPEED;
    }
}
