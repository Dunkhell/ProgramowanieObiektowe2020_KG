import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class PairDemo1 {

    public static void main(String[] args)
    {
        String[] words = { "Ala", "ma", "psa", "i", "kota" };
        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
        mm.swap();
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
        Pair<String> nowaMM = PairUtil.swap(mm);
        System.out.println("min = " + nowaMM.getFirst());
        System.out.println("max = " + nowaMM.getSecond());

    }


}
