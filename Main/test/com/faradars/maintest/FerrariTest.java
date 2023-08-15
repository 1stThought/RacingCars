package com.faradars.maintest;

import com.faradars.entity.Ferrari;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FerrariTest {

    private Ferrari ferrari;

    @Before
    public void setUp() throws Exception {
        ferrari = new Ferrari();
    }

    @Test
    public void getName() {
        Assert.assertEquals("Ferrari",ferrari.getName());
    }

    @Test
    public void getSpeed() {
        Assert.assertEquals(300,ferrari.getSpeed());
    }
}