package pl.imiajd.gruszczynski;

import java.time.LocalDate;

public class Skrzypce extends Instrument{
    public Skrzypce(String n_producent, LocalDate n_data){
        super(n_producent,n_data);
    }

    void dziwek() {
        System.out.println("łi łi łi");
    }
}
