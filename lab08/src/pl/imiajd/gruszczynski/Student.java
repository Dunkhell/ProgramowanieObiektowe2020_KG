package pl.imiajd.gruszczynski;


import java.time.LocalDate;

class Student extends Osoba
{
    public Student(String nazwisko, String kierunek, String imie[], LocalDate n_dataUrodzenia, boolean n_plec, double sredniaOcen)
    {
        super(nazwisko,imie,n_dataUrodzenia,n_plec);
        this.kierunek = kierunek;
        this.średniaOcen= sredniaOcen;
    }

    public void setŚredniaOcen(double n_sredniaOcen){
        this.średniaOcen = n_sredniaOcen;
    }

    public double getŚredniaOcen(){
        return średniaOcen;
    }

    public String getOpis()
    {
        return "kierunek studiów: " + kierunek+". Aktualna średnia: "+średniaOcen;
    }

    private double średniaOcen;
    private String kierunek;
}