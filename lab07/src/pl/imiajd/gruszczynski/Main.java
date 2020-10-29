package pl.imiajd.gruszczynski;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	    Adres nowyAdres = new Adres("Bolesława Chrobrego", "18b","Biskupiec","11-300");
	    nowyAdres.pokaz();

        Adres nowyAdres2 = new Adres("Adama Mickiewicza", "22", "3","Olsztyn","11-900");
        nowyAdres2.pokaz();

        System.out.println(nowyAdres.przed("11-300"));

        Osoba czlowiek = new Osoba("Adamowicz",2006);
        Student student = new Student("Kowalski",2000,"Informatyka Ogólna");
        Nauczyciel nauczyciel = new Nauczyciel("Kowalski",1950, 5250);

        System.out.println(czlowiek);
        System.out.println(student);
        System.out.println(nauczyciel);


        System.out.println("Pensja nauczyciela = "+nauczyciel.get_pensja());
        System.out.println("Nazwisko studenta = "+student.get_nazwisko()+". Studiuje ona na = "+student.get_kierunek());
        System.out.println("Urodzony w roku = "+czlowiek.get_rokUrodzenia());

        BetterRectangle newRect = new BetterRectangle();
        newRect.height=10;
        newRect.width=15;

        System.out.println("Wymiary prostokata: "+newRect.getHeight()+" x "+ newRect.getWidth());
        System.out.println("Obw takiego prostokata: " + newRect.getPerimeter());
        System.out.printf("Pole takiego prostokata: "+ newRect.getArea());
    }
}
