package pl.imiajd.gruszczynski;

import java.time.LocalDate;

public class Fortepian extends Instrument{
    public Fortepian(String n_producent, LocalDate n_data){
        super(n_producent, n_data);
    }

    void dziwek() {
        System.out.println("tu du duu");
    }
}
