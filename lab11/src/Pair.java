import java.util.ArrayList;

public class Pair<T>  implements Comparable<T>{

    public Pair() {
        first = null;
        second = null;
    }

    public Pair (T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }
    public T getSecond() {
        return second;
    }

    public void swap(){
        T temp = this.first;
        this.first= this.second;
        this.second=temp;
    }

    public void setFirst (T newValue) {
        first = newValue;
    }
    public void setSecond (T newValue) {
        second = newValue;
    }

    private T first;
    private T second;

    @Override
    public int compareTo(T o) {
        return 0;
    }
}

