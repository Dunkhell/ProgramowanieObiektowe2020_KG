package pl.imiajd.gruszczynski;

import java.util.ArrayList;
import java.time.LocalDate;

public class TestInstrumenty {
    public static void main(String[] args){
        ArrayList <Instrument> orkiestra= new ArrayList<>();
        orkiestra.add(new Flet("Janko Muzykant", LocalDate.of(2137,6,9)));
        orkiestra.add(new Fortepian("Betowen", LocalDate.of(69,2,2)));
        orkiestra.add(new Flet("TKryniewicz", LocalDate.of(2003,6,9)));
        orkiestra.add(new Flet("Jankosa", LocalDate.of(2222,2,11)));
        orkiestra.add(new Skrzypce("Straszne dźwięki", LocalDate.of(9523,6,13)));
        orkiestra.add(new Flet("Janko Muzykant", LocalDate.of(2032,2,11)));

        for (Instrument a: orkiestra){
            System.out.println(a);
            a.dziwek();
        }
    }
}
