package com.faradars.entity;

public class Ford implements INitroRacingCar {
    public static final String NAME = "Benz   ";
    public static final int MAX_SPEED = 290;

    public String getName() {
        return NAME;
    }

    @Override
    public int getNitroSpeed() {
        return 350;
    }

    @Override
    public int getSpeed() {
        return MAX_SPEED;
    }
}
