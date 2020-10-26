package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Trzy {
    public static int CountStringInFile(String find, String in) throws FileNotFoundException {
        int sumOccurances=0;
        File newFile = new File(in);
        Scanner LineReader = new Scanner(newFile);
        while (LineReader.hasNextLine()){
            String temp=LineReader.nextLine();
            sumOccurances+=Jeden.countSubStr(temp,find);
        }
        LineReader.close();
        return sumOccurances;
    }
}
