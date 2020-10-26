package wmii.uwm.edu.pl;
import java.util.ArrayList;
import java.util.Collections;

public class Trzy {
    public static ArrayList<Integer> mergeSorted (ArrayList<Integer> a, ArrayList<Integer> b){
        Collections.sort(a);
        Collections.sort(b);
        int lengA = a.size();
        int lengB = b.size();
        int elA=0;
        int elB=0;
        int sumLeng= lengA+lengB;
        ArrayList<Integer> merged = new ArrayList<>();
        for (int i=0;i<sumLeng;i++){
            if(elA<lengA&&elB<lengB) {
                if (a.get(elA) < b.get(elB)) {
                    merged.add(a.get(elA));
                    elA++;
                }
                else{
                    merged.add(b.get(elB));
                    elB++;
                }
            }
            else if(elA<lengA){
                merged.add(a.get(elA));
                elA++;
            }
            else{
                merged.add(b.get(elB));
                elB++;
            }
        }
        return merged;
    }
}

