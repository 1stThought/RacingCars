package com.faradars.helpertest;

import com.faradars.util.CalcSpeed;
import org.junit.Assert;

import static org.junit.Assert.*;

public class CalcSpeedTest {

    @org.junit.Test
    public void createCalcSpeed() {
        CalcSpeed calcSpeed=new CalcSpeed();
        Assert.assertNotNull(calcSpeed);
    }
}