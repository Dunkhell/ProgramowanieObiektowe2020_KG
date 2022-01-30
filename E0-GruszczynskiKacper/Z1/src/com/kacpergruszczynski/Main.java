package com.kacpergruszczynski;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<BigInteger> bigIntegers = new ArrayList<>();

        ArrayList<String> strings = new ArrayList<>();

        ArrayList<LocalDate> localDates = new ArrayList<>();

        bigIntegers.add(new BigInteger("20"));
        bigIntegers.add(new BigInteger("10"));
        bigIntegers.add(new BigInteger("30"));
        bigIntegers.add(new BigInteger("50"));
        bigIntegers.add(new BigInteger("40"));

        strings.add("A");
        strings.add("C");
        strings.add("B");
        strings.add("E");
        strings.add("D");

        localDates.add(LocalDate.of(2000,10,7));
        localDates.add(LocalDate.of(2000,10,20));
        localDates.add(LocalDate.of(2000,10,30));
        localDates.add(LocalDate.of(2000,10,1));
        localDates.add(LocalDate.of(2000,10,5));

        System.out.println("====================================");
        System.out.println("BIGINTEGERS");
        System.out.println("isSorted()? = "+ArrayUtil.isSorted(bigIntegers));
        Collections.sort(bigIntegers);
        System.out.println("AFTER SORTING ? = "+ArrayUtil.isSorted(bigIntegers));
        bigIntegers.forEach(System.out::println);
        System.out.println("====================================");
        System.out.println("STRINGS");
        System.out.println("isSorted()? = "+ArrayUtil.isSorted(strings));
        Collections.sort(strings);
        System.out.println("AFTER SORTING ? = "+ArrayUtil.isSorted(strings));
        strings.forEach(System.out::println);
        System.out.println("====================================");
        System.out.println("LOCALDATES");
        System.out.println("isSorted()? = "+ArrayUtil.isSorted(localDates));
        Collections.sort(localDates);
        System.out.println("AFTER SORTING ? = "+ArrayUtil.isSorted(localDates));
        localDates.forEach(System.out::println);


    }
}
