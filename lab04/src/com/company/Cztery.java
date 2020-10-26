package com.company;

import java.math.BigInteger;

public class Cztery {
    public static String ileSzachownica(int n){
        BigInteger pot = new BigInteger("2");
        BigInteger sumaZiarenek = new BigInteger(pot.pow(n*n).toString());
        return sumaZiarenek.subtract(BigInteger.valueOf(1)).toString();
    }
}
