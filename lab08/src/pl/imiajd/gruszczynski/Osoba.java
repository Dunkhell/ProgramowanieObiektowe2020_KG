package pl.imiajd.gruszczynski;

import java.time.LocalDate;

public abstract class Osoba
{
    public Osoba(String nazwisko, String[] imie, LocalDate n_dataUrodzenia, boolean n_plec)
    {
        this.nazwisko = nazwisko;
        this.dataUrodzenia = n_dataUrodzenia;
        this.płeć = n_plec;
        this.imiona=imie;
    }

    public abstract String getOpis();

    public String[] getImiona(){
        return imiona;
    }

    public String getNazwisko()
    {
        return nazwisko;
    }

    public LocalDate getDataUrodzenia(){
        return dataUrodzenia;
    }

    public boolean getPłeć(){
        return płeć;
    }

    private String nazwisko;
    private String[] imiona;
    private LocalDate dataUrodzenia;
    boolean płeć;
}