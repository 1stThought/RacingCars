package com.faradars.util;


import com.faradars.entity.ICar;
import com.faradars.entity.Track;

import java.util.Random;

public class CalcSpeed {

    public CalcSpeed() {
    }

    public static CalcSpeed createCalcSpeed() {
        return new CalcSpeed();
    }

    public  double getSpeed(ICar aCar, Track track){
        Random random= new Random();
        Double speed=  (random.nextDouble()*aCar.getSpeed());

        return 150+(speed/2);
    }
}
