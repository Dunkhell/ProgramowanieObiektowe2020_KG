package pl.imiajd.gruszczynski;

import java.time.LocalDate;
import java.util.*;

public class TestOsoba {
    public static void main(String[] args) {
        Osoba[] ludzie = new Osoba[2];

        ludzie[0] = new Pracownik("Nowak", new String[]{"Adam"}, LocalDate.of(2000, 10, 05), true, 10000, LocalDate.of(2020, 03, 02));
        ludzie[1] = new Student("Kowalska", "Informatyka", new String[]{"Małgorzata"}, LocalDate.of(1999, 02, 02), false, 3.5);
        // ludzie[2] = new Osoba("Dyl Sowizdrzał");

        for (Osoba p : ludzie) {
            for (String i : p.getImiona()) {
                System.out.print(i + " ");
            }
            System.out.print(p.getNazwisko() + ": " + p.getOpis() + " uordzony/a: " + p.getDataUrodzenia() + ", plec: ");
            if (p.getPłeć()) {
                System.out.println("Kobieta");
            } else {
                System.out.println("Mężczyzna");
            }
        }
    }
}

