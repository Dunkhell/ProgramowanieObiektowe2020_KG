package wmii.uwm.edu.pl;

import java.util.ArrayList;

public class Jeden {
    public static ArrayList<Integer> append (ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> summedAB = new ArrayList<Integer>(a);
        summedAB.addAll(b);
        return summedAB;
    }
}
