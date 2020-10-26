package wmii.uwm.edu.pl;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList <Integer> a = new ArrayList<Integer>(){
            {
                add(1);
                add(4);
                add(9);
                add(16);
            }
        };
        ArrayList <Integer> b = new ArrayList<Integer>(){
            {
                add(9);
                add(7);
                add(4);
                add(9);
                add(11);
            }
        };
        System.out.println("Suma list a i b wynois: "+Jeden.append(a,b));
        System.out.println("Złączone listy a i b funkcją merge: "+Dwa.merge(a,b));
        System.out.println("Złączone list a i b po sortowaniu funkcją mergeSorted: "+Trzy.mergeSorted(a,b));
        System.out.println("Nowa lista na podstawie odwróconej listy a: "+Cztey.reversed(a));
        Piec.reversed(a);
        System.out.println("Odwrócona lista a: "+a);
    }
}
