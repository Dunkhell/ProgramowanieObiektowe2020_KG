package pl.imiajd.gruszczynski;

import java.time.LocalDate;

class Pracownik extends Osoba
{
    public Pracownik(String nazwisko, String[] imie, LocalDate n_dataUrodzenia, boolean n_plec, double pobory, LocalDate dataZatrudnienia)
    {
        super(nazwisko,imie,n_dataUrodzenia,n_plec);
        this.pobory = pobory;
        this.dataZatrudnienia=dataZatrudnienia;
    }

    public double getPobory()
    {
        return pobory;
    }

    public LocalDate getDataZatrudnienia(){
        return this.dataZatrudnienia;
    }

    public String getOpis()
    {
        return String.format("pracownik zatrudniony ",dataZatrudnienia.toString()," z pensją %.2f zł", pobory);
    }

    private double pobory;
    private LocalDate dataZatrudnienia;
}