package com.company;

import java.io.FileNotFoundException;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        String e1 = "anananasek";
        String e2 = "an";
        System.out.println("Pierwsze a wynik: "+Jeden.countChar("Adam",'a'));
        System.out.println("Pierwsze b wynik: "+Jeden.countSubStr("BABCCXDDBCBCCXDBCC","BCC"));
        System.out.println("Pierwsze c wynik: "+Jeden.middle("middle"));
        System.out.println("Pierwsze d wynik: "+Jeden.repeat("ho",3));
        int[] where = Jeden.where(e1,e2);
        System.out.print("Pierwsze e, substring "+e2 +"wystepuje "+ where.length+" razy w napisie"+e2+"na indexach: ");
        for (int i=0;i<where.length;i++){
            System.out.print(where[i]+" ");
        }
        System.out.println();
        System.out.println("Pierwsze f wynik: "+Jeden.change("aH YES! vICTORY"));
        System.out.println("Pierwsze g wyniK "+Jeden.nice("takimalytestczywszystkodziala"));
        System.out.println("Pierwsze h wyniK: "+Jeden.nice("takidrugitestczydzialapoprawnie",2,';'));

        char find = 'l';
        String toFind = "lorum";

        System.out.println("Char "+find+" występuje w pliku "+ Dwa.CountCharInFile(find, "E:\\UWM\\semestr III\\Programowanie Obiektowe\\ZadaniaPO\\JavaProgrammingMC\\lab04\\src\\com\\company\\testlab04"));
        System.out.println("String "+ toFind+" wystepuje w pliku "+ Trzy.CountStringInFile(toFind,"E:\\UWM\\semestr III\\Programowanie Obiektowe\\ZadaniaPO\\JavaProgrammingMC\\lab04\\src\\com\\company\\testlab04"));
        int x=3;
        System.out.println("Suma ziarenek na polu "+x+" na "+x+" wynosi: "+Cztery.ileSzachownica(x));
        float kapital=1200f;
        int lata=20;
        float oproc=0.05f;
        DecimalFormat df = new DecimalFormat("#,###.00");
        System.out.println("Kapital poczatkowy "+kapital+" przy oprocentowaniu "+oproc+" po "+lata+" latach wynosi: "+ df.format(Piec.Kapital(lata,kapital,oproc))  );
    }

}
