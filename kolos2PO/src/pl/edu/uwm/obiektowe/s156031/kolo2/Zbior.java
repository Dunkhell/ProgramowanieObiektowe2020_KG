package pl.edu.uwm.obiektowe.s156031.kolo2;

import java.util.ArrayList;
import java.util.Iterator;

public class Zbior {
    private ArrayList<Liczba<? extends Number>> lista;

    public Zbior(){
        this.lista = new ArrayList<>();
    }

    public void dodajLiczbe( Liczba I){
        boolean hasBeenAdded = false;
        for (Liczba x : this.lista){
            if(x.compareTo(I)==0){
                hasBeenAdded=true;
            }
        }
        if(!hasBeenAdded){
            this.lista.add(I);
        }
    }

//    public void dodajLiczbe(Liczba<? extends Number> I){
//        if(!lista.contains(I)){
//            lista.add(I);
//        }
//    }

    public ArrayList<Liczba<? extends Number>> getLista(){
        return lista;
    }

    @Override
    public String toString(){
        return lista.toString();
    }
}
