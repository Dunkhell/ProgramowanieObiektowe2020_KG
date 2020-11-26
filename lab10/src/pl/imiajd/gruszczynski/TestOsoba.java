package pl.imiajd.gruszczynski;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class TestOsoba {
    public static void main(String[] args) {
        ArrayList <Osoba> grupa = new ArrayList<>();
        grupa.add(new Osoba("Adamowicz", LocalDate.of(2020,12,10))); //0
        grupa.add(new Osoba("Adamowicz", LocalDate.of(1932,1,10))); //1
        grupa.add(new Osoba("Małysz", LocalDate.of(2009,10,3))); //2
        grupa.add(new Osoba("Małysz", LocalDate.of(2009,10,3))); //3
        grupa.add(new Osoba("Poggers", LocalDate.of(2009,10,3))); //4
        grupa.add(new Osoba("Adamowicz", LocalDate.of(2009,10,3))); //5

        for (Osoba e : grupa){
            System.out.println(e);
        }

        System.out.println(grupa.get(0)+" equals? "+grupa.get(1));
        System.out.println(grupa.get(0).equals(grupa.get(1)));
        System.out.println(grupa.get(0).compareTo(grupa.get(1)));
        System.out.println(grupa.get(2)+" equals? "+grupa.get(3));
        System.out.println(grupa.get(2).equals(grupa.get(3)));
        System.out.println(grupa.get(2).compareTo(grupa.get(3)));
        System.out.println(grupa.get(2)+" equals? "+grupa.get(4));
        System.out.println(grupa.get(2).equals(grupa.get(4)));
        System.out.println(grupa.get(2).compareTo(grupa.get(4)));

        Collections.sort(grupa);

        for (Osoba e : grupa){
            System.out.println(e);
        }

        ArrayList<Student> grupaStudentow = new ArrayList<>();
        grupaStudentow.add(new Student("Adamowicz",LocalDate.of(2020,1,10),3.9));
        grupaStudentow.add(new Student("Adamowicz",LocalDate.of(2000,1,10),4.2));
        grupaStudentow.add(new Student("Małysz",LocalDate.of(2020,1,10),3.9));
        grupaStudentow.add(new Student("Małysz",LocalDate.of(2020,1,10),3.9));
        grupaStudentow.add(new Student("Małysz",LocalDate.of(2020,1,10),2.2));

        for (Student e : grupaStudentow){
            System.out.println(e);
        }

        System.out.println(grupaStudentow.get(2)+" comperable to? "+grupaStudentow.get(3));
        System.out.println(grupaStudentow.get(2).compareTo(grupaStudentow.get(3)));
        System.out.println(grupaStudentow.get(2)+" comperable to? "+grupaStudentow.get(4));
        System.out.println(grupaStudentow.get(2).compareTo(grupaStudentow.get(4)));
    }
}
