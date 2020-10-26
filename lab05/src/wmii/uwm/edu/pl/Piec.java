package wmii.uwm.edu.pl;

import java.util.ArrayList;

public class Piec {
    public static void reversed (ArrayList<Integer>a){
        ArrayList<Integer> temp = new ArrayList<>(a);
        int elA=0;
        for (int i=temp.size()-1;i>=0;i--){
            a.set(i,temp.get(elA));
            elA++;
        }
    }
}
