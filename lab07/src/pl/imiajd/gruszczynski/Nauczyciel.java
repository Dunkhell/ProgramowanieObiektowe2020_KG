package pl.imiajd.gruszczynski;

public class Nauczyciel extends Osoba {
    private int pensja;

    public Nauczyciel(String n_nazwisko, int n_rokUrodzenia, int n_pensja){
        super(n_nazwisko, n_rokUrodzenia);
        this.pensja=n_pensja;
    }

    @Override
    public String toString() {
        return super.toString()+String.format(". Zarabia "+pensja);
    }
    public String get_nazwisko(){
        return super.get_nazwisko();
    }
    public int get_rokUrodzenia(){
        return super.get_rokUrodzenia();
    }
    public int get_pensja(){
        return this.pensja;
    }
}
