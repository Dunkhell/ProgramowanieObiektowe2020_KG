package pl.edu.uwm.obiektowe.s156031.kolo2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Osobowy samochud = new Osobowy("Szybki", Pojazd.Producent.BMW);
        System.out.println(samochud);
        samochud.cofaj();
        samochud.uzyjKlaksonu();

        Liczba<Integer> Int1 = new Liczba<>(10);
        Liczba<Double> Double1 = new Liczba<>(10.0);
        Liczba<Float> Float1 = new Liczba<>((float)11.3);
        Liczba<Long> Long1 = new Liczba<>((long)12);
        Liczba<Short> Short1 = new Liczba<>((short)1);
        Liczba<Short> Short2 = new Liczba<>((short)1);

        Stack<Liczba<? extends Number>> stackLiczb = new Stack<>();
        stackLiczb.push(Int1);
        stackLiczb.push(Double1);
        stackLiczb.push(Float1);
        stackLiczb.push(Long1);
        stackLiczb.push(Short1);
        stackLiczb.push(Short2);
        System.out.println(stackLiczb);


        Zbior zbiorLiczb = new Zbior();
        while(!stackLiczb.isEmpty()){
            zbiorLiczb.dodajLiczbe(stackLiczb.pop());
        }
        System.out.println(zbiorLiczb);
    }
}
