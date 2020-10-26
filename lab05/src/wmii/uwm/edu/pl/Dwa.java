package wmii.uwm.edu.pl;

import java.util.ArrayList;

public class Dwa {
    public static ArrayList<Integer> merge (ArrayList<Integer> a, ArrayList<Integer> b){
        int lengA = a.size();
        int lengB = b.size();
        int elA=0;
        int elB=0;
        int sumLeng= lengA+lengB;
        ArrayList<Integer> merged = new ArrayList<Integer>();
        for (int i=0;i<sumLeng;i++){
            if(i%2==0 && lengA != 0){
                merged.add(a.get(elA));
                lengA--;
                elA++;
            }
            else if (lengB !=0){
                merged.add(b.get(elB));
                lengB--;
                elB++;
            }
        }
        return merged;
    }
}
