package pl.imiajd.gruszczynski;

public class Osoba {
    private final int rokUrodzenia;
    private final String nazwisko;

    public Osoba(String n_nazwisko, int n_rokUrodzenia){
            this.rokUrodzenia= n_rokUrodzenia;
            this.nazwisko=n_nazwisko;
    }

    @Override
    public String toString(){
        return String.format(nazwisko+" urodzony w "+rokUrodzenia);
    }

    public int get_rokUrodzenia(){
        return this.rokUrodzenia;
    }

    public String get_nazwisko(){
        return this.nazwisko;
    }
}
