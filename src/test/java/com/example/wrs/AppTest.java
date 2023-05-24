package com.example.wrs;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testAWSSM_hostValue()
    {
        MySecrets ms = new MySecrets();
        String secret = ms.getHostSecret();

        
        assertTrue( true );
    }
}
