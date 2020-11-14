package pl.imiajd.gruszczynski;

import java.time.LocalDate;

abstract class Instrument {
    private String producent;
    private LocalDate rokProdukcji;

    public Instrument(String n_producent, LocalDate n_data){
        this.producent= n_producent;
        this.rokProdukcji= n_data;
    }

    public String getProducent(){
        return this.producent;
    }

    public LocalDate getRokProdukcji(){
        return this.rokProdukcji;
    }

    abstract void dziwek();

    @Override
    public boolean equals(Object anObject){
        return this.toString().equals(anObject.toString());
    }

    @Override
    public String toString(){
        return "instrument: "+this.getClass().getSimpleName()+" rok produkcji: "+this.rokProdukcji+" producent: "+this.producent;
    }
}
