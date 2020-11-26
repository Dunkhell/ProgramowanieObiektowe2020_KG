package pl.imiajd.gruszczynski;

import java.time.LocalDate;

public class Student extends Osoba implements Cloneable, Comparable<Osoba> {
    private double sredniaOcen;

    public Student(String nazwisko, LocalDate dataN, double sredniaOcen){
        super(nazwisko,dataN);
        this.sredniaOcen = sredniaOcen;
    }

    public String toString(){
        return super.toString() + " Ze średnią ocen "+sredniaOcen;
    }

    public int compareTo(Osoba o){
        int result = super.compareTo(o);
        if (result==0 && o instanceof Student){
            result = Double.compare(this.sredniaOcen,((Student)o).sredniaOcen);
        }
        return result;
    }
}
