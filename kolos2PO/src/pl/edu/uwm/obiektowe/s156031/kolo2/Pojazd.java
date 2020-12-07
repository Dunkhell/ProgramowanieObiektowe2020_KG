package pl.edu.uwm.obiektowe.s156031.kolo2;

import java.time.LocalDate;

public abstract class Pojazd{

    public Pojazd(String nModel, Producent nProducent){
        this.model=nModel;
        this.producent=nProducent;
        this.dataProduckji= LocalDate.now();
    }

    public enum Producent{
        FORD, AUDI, BMW, SKODA
    }

    abstract void uzyjKlaksonu();
    void jedzDoPrzodu(){
        System.out.println("Jade do przodu");
    }

    @Override
    public String toString(){
        return "Model "+this.model+" producent "+this.producent+" dataProdukcji "+this.dataProduckji.toString();
    }

    String model;
    Producent producent;
    LocalDate dataProduckji;

}
