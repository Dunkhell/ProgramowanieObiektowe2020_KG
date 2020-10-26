package wmii.uwm.edu.pl;

import java.util.ArrayList;

public class Cztey {
    public static ArrayList<Integer> reversed (ArrayList<Integer>a){
        int lengA = a.size();
        ArrayList<Integer> reverse= new ArrayList<>();
        for (int i=lengA-1;i>=0;i--){
            reverse.add(a.get(i));
        }
        return reverse;
    }
}
