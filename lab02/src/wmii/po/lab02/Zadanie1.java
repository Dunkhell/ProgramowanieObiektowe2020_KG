package wmii.po.lab02;

import java.util.Scanner;


public class Zadanie1 {
    public static int pierwsze (int n)
    {
        Scanner cyfra = new Scanner(System.in);
        System.out.println("Wprowadź liczbę: ");
        int suma=0;
        for (int i=0;i<n;i++)
        {
            suma=suma+cyfra.nextInt();
        }
        return suma;
    }
    public static int drugie(int n)
    {
        Scanner cyfra = new Scanner(System.in);
        System.out.println("Wprowadź liczbę: ");
        int iloczyn=1;
        for (int i=0;i<n;i++)
        {
            iloczyn=iloczyn*cyfra.nextInt();
        }
        return iloczyn;
    }

    public static int trzecie(int n)
    {
        Scanner cyfra = new Scanner(System.in);
        System.out.println("Wprowadź liczbę: ");
        int suma=0,dodo;
        for (int i=0;i<n;i++)
        {
            dodo= cyfra.nextInt();
            if (dodo < 0 )
            {
                suma=suma-dodo;
            }
            else
            {
                suma=suma+dodo;
            }
        }
        return suma;
    }
    public static double czwarte(int n)
    {
        Scanner cyfra = new Scanner(System.in);
        System.out.println("Wprowadź liczbę: ");
        double suma=0, dodo;
        for (int i=0;i<n;i++)
        {
            dodo= cyfra.nextInt();
            if (dodo < 0 )
            {
                suma=suma- Math.sqrt(dodo);
            }
            else
            {
                suma=suma+ Math.sqrt(dodo);
            }
        }
        return suma;
    }
    public static int piate(int n)
    {
        Scanner cyfra = new Scanner(System.in);
        System.out.println("Wprowadź liczbę: ");
        int iloczyn=1,dodo;
        for (int i=0;i<n;i++)
        {
            dodo= cyfra.nextInt();
            if (dodo < 0 )
            {
                dodo=-dodo;
                iloczyn=iloczyn *dodo;
            }
            else
            {
                iloczyn=iloczyn* dodo;
            }
        }
        return iloczyn;
    }
    public static double szoste(int n)
    {
        Scanner cyfra = new Scanner(System.in);
        System.out.println("Wprowadź liczbę: ");
        double suma=0;
        for (int i=0;i<n;i++)
        {
            suma=suma+Math.pow(cyfra.nextInt(),2);
        }
        return suma;
    }
    public static void siodme(int n)
    {
        Scanner cyfra = new Scanner(System.in);
        System.out.println("Wprowadź liczbę: ");
        int suma=0,dodo,iloczyn=1;

        for (int i=0;i<n;i++)
        {
            dodo=cyfra.nextInt();
            suma=suma+dodo;
            iloczyn=iloczyn*dodo;
        }

        System.out.println("Suma tego działania to: "+suma);
        System.out.println("Iloczyn tego działania to: "+iloczyn);

    }
    public static double osme(int n)
    {
        Scanner cyfra = new Scanner(System.in);
        System.out.println("Wprowadz liczbe: ");
        double wynik=0;
        for (int i=1;i<=n;i++)
        {
            wynik=wynik+ (cyfra.nextInt())*Math.pow(-1,i+1);
        }
        return wynik;
    }
    static double silnia (int n)
    {
        double siln=1;
        for (int i=1;i<=n;i++)
        {
            siln=siln*i;
        }
        return siln;
    }
    public static double dziewiate(int n)
    {
        Scanner cyfry = new Scanner(System.in);
        System.out.println("Wprowadz liczbe: ");
        double wynik=0;
        for (int i=1;i<=n;i++)
        {
            wynik= wynik + (Math.pow(-1,i)*(cyfry.nextInt()))/silnia(i);
        }
        return wynik;
    }
    public static int[] movearr(int n, int tab[])
    {
        Scanner cyrfry = new Scanner(System.in);
        int wynik[]=new int[n];
        for (int i=1;i<n;i++)
        {
            wynik[i-1]=tab[i];
        }
        wynik[n-1]=tab[0];
        return wynik;
    }
    public static void wypisz(int n)
    {
        Scanner cyfra = new Scanner(System.in);
        System.out.println("Wprowadz liczby: ");
        int tab[]=new int[n];
        for (int i=0;i<n;i++)
        {
            tab[i]= cyfra.nextInt();
        }
        for (int i=0;i<n;i++)
        {
            System.out.println(movearr(n,tab)[i]);
        }

    }


}
