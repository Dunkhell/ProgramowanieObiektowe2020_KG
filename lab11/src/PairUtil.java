import java.util.ArrayList;

public class PairUtil<T>{

    public static <T> Pair<T> swap(Pair<T> o){
        Pair<T> newPair = new Pair<>(o.getSecond(), o.getFirst());
        return newPair;
    }
}
