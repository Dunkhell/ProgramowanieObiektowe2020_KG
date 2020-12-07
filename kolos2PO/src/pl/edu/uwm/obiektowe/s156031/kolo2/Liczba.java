package pl.edu.uwm.obiektowe.s156031.kolo2;
import java.math.BigDecimal;

public class Liczba<T extends  Number & Comparable<T>> implements Comparable<Liczba<T>>{

    public Liczba(T Nvalue){
        this.value= Nvalue;
    }

    public T getValue(){
        return value;
    }

    @Override
    public int compareTo(Liczba o) {
        return new BigDecimal(this.value.toString()).compareTo(new BigDecimal(o.getValue().toString()));
    }

    @Override
    public String toString(){
        return "Data type: "+value.getClass().getSimpleName()+" | Value: "+value;
    }

    private T value;
}
