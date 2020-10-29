package pl.imiajd.gruszczynski;

public class Student extends Osoba {
    private String kierunek;

    public Student(String n_nazwisko, int n_rokUrodzenia, String n_kierunek){
        super(n_nazwisko, n_rokUrodzenia);
        this.kierunek=n_kierunek;
    }

    @Override
    public String toString() {
        return super.toString()+String.format(". Studiuje na "+kierunek);
    }

    public String get_nazwisko(){
        return super.get_nazwisko();
    }
    public int get_rokUrodzenia(){
        return super.get_rokUrodzenia();
    }
    public String get_kierunek(){
        return this.kierunek;
    }
}
