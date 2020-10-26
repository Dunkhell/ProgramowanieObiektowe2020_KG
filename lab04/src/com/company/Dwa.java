package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dwa {
    public static int CountCharInFile(char find, String in){
        int sumOccurances=0;
        try {
            File newFile = new File(in);
            Scanner LineReader = new Scanner(newFile);
            while (LineReader.hasNextLine()){
                String linia = LineReader.nextLine();
                for (int i=0; i<linia.length();i++){
                    if (linia.charAt(i)==find)
                        sumOccurances++;
                }
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File doesn't exist!");
            e.printStackTrace();
        }
        return sumOccurances;
    }
}
