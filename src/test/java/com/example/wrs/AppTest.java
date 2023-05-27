package com.example.wrs;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class AppTest 
{
    @Test
    public void testAWSSM_hostValue()
    {
        MySecrets ms = new MySecrets();
        String actualSecret = ms.getHostSecret();
        String expectedSecret = "RyanSeacrest";

        assertEquals(actualSecret, expectedSecret, "The expected secret was not returned");
    }
}
