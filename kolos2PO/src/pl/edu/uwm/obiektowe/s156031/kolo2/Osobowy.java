package pl.edu.uwm.obiektowe.s156031.kolo2;

import java.time.LocalDate;

public class Osobowy extends Pojazd implements IMozeCofac{

    public Osobowy(String model, Producent producent){
        super(model,producent);
    }

    @Override
    void uzyjKlaksonu() {
        System.out.println("Bip beep");
    }
}
