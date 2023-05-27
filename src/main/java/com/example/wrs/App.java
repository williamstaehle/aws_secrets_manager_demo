package com.example.wrs;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MySecrets ms = new MySecrets();
        String host = ms.getHostSecret();
        System.out.println("The returned value is = " + host);

        

    }



}
