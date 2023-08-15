package com.faradars.maintest;

import com.faradars.entity.Benz;
import org.junit.Assert;
import org.junit.Test;

public class BenzTest {

    @Test
    public void benzNameTest(){
        Benz benz=new Benz();
        Assert.assertEquals("Benz   ",benz.getName());
    }

    @Test
    public void benzSpeedTest(){
        Benz benz=new Benz();
        Assert.assertEquals(290,benz.getSpeed());
    }

}
