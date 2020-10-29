package pl.imiajd.gruszczynski;


public class Adres {
    private String ulica;
    private String numer_domu;
    private String numer_mieszkania;
    private String miasto;
    private String kod_pocztowy;

    public Adres (String n_ulica, String n_nr_domu, String n_miasto, String n_kp){
        this.ulica= n_ulica;
        this.numer_domu=n_nr_domu;
        this.miasto=n_miasto;
        this.kod_pocztowy=n_kp;
    }

    public Adres (String n_ulica, String n_nr_domu, String n_nrmieszkania,String n_miasto, String n_kp){
        this.ulica= n_ulica;
        this.numer_domu=n_nr_domu;
        this.numer_mieszkania=n_nrmieszkania;
        this.miasto=n_miasto;
        this.kod_pocztowy=n_kp;
    }

    public void pokaz(){
        System.out.println("Miasto: "+this.miasto+" | Kod pocztowy: "+this.kod_pocztowy);
        System.out.print("Ulica: "+this.ulica+" | numer domu: "+this.numer_domu);
        if (numer_mieszkania != null){
            System.out.println(" | numer mieszkania: "+this.numer_mieszkania);
        }
        System.out.println();
    }

    public boolean przed(String innyKP){
        return innyKP.equals(kod_pocztowy);
    }
}

