package pl.imiajd.gruszczynski;

import java.time.LocalDate;

public class Flet extends Instrument{

    public Flet(String n_producent, LocalDate n_data){
        super(n_producent,n_data);
    }

    void dziwek() {
        System.out.println("Fjuu");
    }
}
