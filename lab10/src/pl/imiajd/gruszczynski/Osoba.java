package pl.imiajd.gruszczynski;
import java.time.LocalDate;

public class Osoba implements Comparable<Osoba>, Cloneable{

    public Osoba(String n_nazwisko, LocalDate n_dataUrodzenia){
        this.nazwisko= n_nazwisko;
        this.dataUrodzenia = n_dataUrodzenia;
    }

    @Override
    public boolean equals(Object obj) {
        Osoba osb = (Osoba) obj;
        return (osb.nazwisko.equals(this.nazwisko) && osb.dataUrodzenia.equals(this.dataUrodzenia));
    }
    public String getNazwisko(){
        return nazwisko;
    }

    public LocalDate getDataUrodzenia(){
        return dataUrodzenia;
    }

    @Override
    public String toString(){
        return "klasa: "+getClass().getSimpleName()+ " ["+nazwisko+" "+dataUrodzenia+"] ";
    }

    @Override
    public int compareTo(Osoba o) {
        int result = this.nazwisko.compareTo(o.nazwisko);
        if (result==0){
            result = this.dataUrodzenia.compareTo(o.dataUrodzenia);
        }
        return result;
    }
    private String nazwisko;
    private LocalDate dataUrodzenia;
}
