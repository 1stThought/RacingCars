package com.faradars.util;

import com.faradars.entity.IRacingCar;
import com.faradars.entity.Track;

import java.util.Random;

public class getSpeedParam {
    private final IRacingCar aCar;
    private final Track track;

    public getSpeedParam(IRacingCar aCar, Track track) {
        this.aCar = aCar;
        this.track = track;
    }

    public IRacingCar getaCar() {
        return aCar;
    }

    public Track getTrack() {
        return track;
    }

    public  double getSpeed(){
        Random random= new Random();
        Double speed=  (random.nextDouble()* getaCar().getSpeed());

        return 150+(speed/2);
    }
}
