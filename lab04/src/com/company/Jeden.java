package com.company;

public class Jeden {
    public static int countChar (String str, char c){
        int wynik = 0;
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)==c){
                wynik++;
            }
        }
        return wynik;
    }
    public static int countSubStr (String str, String substr) {
        int wynik = 0;
        String test;
        for (int i=0;i<=str.length()-substr.length();i++){
            test=str.substring(i,i+substr.length());
            if (test.equals(substr))
                wynik++;
        }
        return wynik;
    }
    public static String middle (String str){
        String wynik;
        char temp;
        int strLen= str.length();
        if (strLen%2==1){
            temp=str.charAt(strLen/2);
            wynik =String.valueOf(temp);
        }
        else{
            temp= str.charAt(strLen/2);
            char temp2= str.charAt(strLen/2-1);
            wynik = String.valueOf(temp2)+String.valueOf(temp);
        }
        return wynik;
    }
    public static String repeat (String str, int n){
        StringBuilder wynik = new StringBuilder();
        for (int i=0;i<n;i++) {
            wynik.append(str);
        }
        return wynik.toString() ;
    }
    public static int[] where(String str, String subStr){
        int[]wynik= new int[countSubStr(str,subStr)];
        String temp= str;
        wynik[0]= temp.indexOf(subStr);
        for (int i=1;i<wynik.length;i++){
            temp = str.substring(wynik[i-1]+1);
            wynik[i]=temp.indexOf(subStr)+wynik[i-1]+1;
        }
        return wynik;
    }
    public static String change(String str){
        StringBuffer newString = new StringBuffer();
        for (int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i)))
                newString.append(String.valueOf(str.charAt(i)).toLowerCase());
            else
                newString.append(String.valueOf(str.charAt(i)).toUpperCase());
        }
        return newString.toString();
    }
    public static String nice (String str){
        StringBuffer liczbowe = new StringBuffer();
        int poz = 1;
        for (int i = str.length()-1; i >=0; i--) {
            liczbowe.append(str.charAt(i));
            if(poz%3==0 && i!=0)
                liczbowe.append("'");
            poz++;
        }
        String temp=liczbowe.toString();
        liczbowe = new StringBuffer();
        for (int i = temp.length()-1;i>=0;i--) {
            liczbowe.append(temp.charAt(i));
        }
        return liczbowe.toString();
    }
    public static String nice (String str, int n, char c){
        StringBuffer liczbowe = new StringBuffer();
        int poz = 1;
        for (int i = str.length()-1; i >=0; i--) {
            liczbowe.append(str.charAt(i));
            if(poz%n==0 && i!=0)
                liczbowe.append(c);
            poz++;
        }
        String temp=liczbowe.toString();
        liczbowe = new StringBuffer();
        for (int i = temp.length()-1;i>=0;i--) {
            liczbowe.append(temp.charAt(i));
        }
        return liczbowe.toString();
    }
}
