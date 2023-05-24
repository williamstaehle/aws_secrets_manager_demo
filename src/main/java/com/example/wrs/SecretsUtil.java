package com.example.wrs;

public class SecretsUtil {

    private static String secretName = "";
    private static String secretValue = "";
    private static String regionValue = "";




    public SecretsUtil() {

    }


    public static String getSecretName() {
        return secretName;
    }


    public static void setSecretName(String secretName) {
        SecretsUtil.secretName = secretName;
    }


    public static String getSecretValue() {
        return secretValue;
    }

    public static void setRegionValue(String regionValue) {
        SecretsUtil.regionValue = regionValue;
    }


}
