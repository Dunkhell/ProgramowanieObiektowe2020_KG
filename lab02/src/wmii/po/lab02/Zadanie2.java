package wmii.po.lab02;

import java.util.Scanner;

public class Zadanie2 {
    public static int pierwsze (int n)
    {
        Scanner cyfra = new Scanner(System.in);
        System.out.println("Wprowadź liczbę: ");
        int suma=0;
        for (int i=0;i<n;i++)
        {
            if (cyfra.nextInt()%2==0)
                suma = suma + 1;
        }
        return suma;
    }
    public static int drugie (int n)
    {
        Scanner cyfra = new Scanner(System.in);
        System.out.println("Wprowadź liczbę: ");
        int suma=0;
        for (int i=0;i<n;i++)
        {
            int cyferka= cyfra.nextInt();
            if (cyferka%3==0 && cyferka%5!=0)
                suma = suma + 1;
        }
        return suma;
    }
    public static int trzecie (int n)
    {
        Scanner cyfra = new Scanner(System.in);
        System.out.println("Wprowadź liczbę: ");
        int suma=0;
        for (int i=0;i<n;i++)
        {
            int cyferka= cyfra.nextInt();
            if (Math.sqrt(cyferka)%2==0)
                suma = suma + 1;
        }
        return suma;
    }
    public static int czwarte(int n)
    {
        Scanner cyfra = new Scanner(System.in);
        System.out.println("Wprowadz liczbe: ");
        int suma=0;
        int cyferki[]= new int[n];
        for (int i=0;i<n;i++)
        {
            int cyferka= cyfra.nextInt();
            cyferki[i]=cyferka;
        }
        for (int i=1;i<n-1;i++)
        {
            if(cyferki[i]<(cyferki[i-1]+cyferki[i+1])/2) {
                suma = suma + 1;
            }
        }
        return suma;
    }
    static int silnia (int n)
    {
        int siln=1;
        for (int i=1;i<=n;i++)
        {
            siln=siln*i;
        }
        return siln;
    }
        public static int piate(int n)
    {
        Scanner cyfra = new Scanner(System.in);
        System.out.println("Wprowadz liczbe: ");
        int suma=0;
        int cyferki[]= new int[n];
        for (int i=0;i<n;i++)
        {
            int cyferka= cyfra.nextInt();
            cyferki[i]=cyferka;
        }
        for (int i=0;i<n;i++)
        {
            if (cyferki[i]>Math.pow(2,i) && cyferki[i]<silnia(i))
            {
                suma=suma+1;
            }
        }
        return suma;
    }
    public static int szoste (int n)
    {
        Scanner cyfra = new Scanner(System.in);
        System.out.println("Wprowadz liczbe: ");
        int suma=0;
        int cyferki[]= new int[n];
        for (int i=0;i<n;i++)
        {
            int cyferka= cyfra.nextInt();
            cyferki[i]=cyferka;
        }
        for (int i=1;i<=n;i++)
        {
            if (i%2==1 && cyferki[i-1]%2==0){
                suma= suma+1;
            }
        }
        return suma;
    }
    public static int siodme(int n)
    {
        Scanner cyfra = new Scanner(System.in);
        System.out.println("Wprowadz liczbe: ");
        int suma=0;
        for (int i=0;i<n;i++)
        {
            int cyferka= cyfra.nextInt();
            if (cyferka%2==1 && cyferka>=0)
            {
                suma++;
            }
        }
        return suma;
    }
    public static int osme(int n)
    {
        Scanner cyfra = new Scanner(System.in);
        System.out.println("Wprowadz liczbe: ");
        int suma=0;
        for (int i=1;i<=n;i++)
        {
            int cyferka= cyfra.nextInt();
            if (cyferka<0){
                cyferka=cyferka*-1;
            }
            if (cyferka<Math.pow(i,2)){
                suma=suma+1;
            }
        }
        return suma;
    }
    public static int dwa(int n)
    {
        Scanner cyfra = new Scanner(System.in);
        System.out.println("Wprowadz liczbe");
        int suma=0;
        for (int i=0;i<n;i++)
        {
            int cyferka= cyfra.nextInt();
            if (cyferka>=0){
                suma=suma+2*cyferka;
            }
        }
        return suma;
    }

    /*
    do wykonania tego zadania użyłem zewnętrznej klasy tylko i wyłącznie w celu poćwiczenia i próby samego siebie
     */
    public static void trzy(int n)
    {
        ileJakich suma = new ileJakich(0,0,0);
        Scanner cyfra = new Scanner(System.in);
        System.out.println("Wprowadz liczbe");
        for (int i=0;i<n;i++)
        {
            int cyferka= cyfra.nextInt();
            if (cyferka==0){
                suma.zera= suma.zera+1;
            }
            else if (cyferka>=0)
            {
                suma.dodatnie= suma.dodatnie +1;
            }
            else
            {
                suma.ujemne= suma.ujemne+1;
            }
        }
        ileJakich.wypisz(suma);
    }
    public static String cztery(int n)
    {
        Scanner cyfra = new Scanner(System.in);
        System.out.println("Wprowadz liczbe: ");
        int cyferka=cyfra.nextInt();
        int max=cyferka,min=cyferka;
        for (int i=1;i<n;i++)
        {
            cyferka=cyfra.nextInt();
            if (cyferka>max){
                max=cyferka;
            }
            if (cyferka<min){
                min=cyferka;
            }
        }
        return "Maksymalna liczba to: "+max+" Minimalna liczba to: "+min;
    }
    public static int piec(int n)
    {
        int tab[]= new int[n];
        int suma=0;
        Scanner cyfra = new Scanner(System.in);
        System.out.println("Wproawdz liczbe: ");
        for (int i=0;i<n;i++)
        {
            tab[i]=cyfra.nextInt();
        }
        for (int i=1;i<n;i++)
        {
            if (tab[i-1]>0 && tab[i]>0){
                suma= suma+1;
            }
        }
        return suma;
    }
}
