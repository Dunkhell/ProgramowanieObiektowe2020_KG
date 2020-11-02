package pl.imiajd.gruszczynski;


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
        System.out.println("Pole takiego prostokata: "+ newRect.getArea());

        NazwanyPunkt a = new NazwanyPunkt(3, 5, "port");
        a.show();

        Punkt b = new Punkt(3, 5);
        b.show();

        NazwanyPunkt c = new NazwanyPunkt(3, 6, "tawerna");
        c.show();

        //a = b;               //  --- powoduje błąd kompilacji  (dlaczego ?)
//        a = (NazwanyPunkt) b;  //   --- powoduje błąd wykonania   (dlaczego ?): W klasie NazwanyPunkt znajduje się jeddno pole dodatkowe które nie może być puste
        // podczas castowania obiektu b na klase NazwanyPuntk nie nadajemy mu żadnej nazwy więc takie działanie jest niemożliwe

        a = c;                 //--- powoduje błąd kompilacji  (dlaczego ?) A i C były obiektami różnych klas.
        a = (NazwanyPunkt) c;
        a.show();
    }
}
