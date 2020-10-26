package com.company;

import java.math.BigDecimal;

public class Piec {
    public static BigDecimal Kapital (int n, float k, float p){
        BigDecimal a = new BigDecimal(String.valueOf(k));
        BigDecimal proc = new BigDecimal(String.valueOf(p));
        for (int i = 0; i < n; i++) {
            BigDecimal dodaj = new BigDecimal(a.multiply(proc).toString());
            a=a.add(dodaj);
        }
        return a;
    }
}
