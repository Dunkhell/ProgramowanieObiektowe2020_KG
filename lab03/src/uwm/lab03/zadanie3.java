package uwm.lab03;

import java.util.Scanner;

public class zadanie3 {

    public static void wypisz(int[][] tab) {
        for (int[] row: tab) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }

    public static int[][] mnozenie(int[][] tab, int[][] tab2, int r1, int c1, int c2) {
        int[][] wynik = new int[r1][c2];
        for(int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int l = 0; l < c1; l++) {
                    wynik[i][j] += tab[i][l] * tab2[l][j];
                }
            }
        }

        return wynik;
    }





    public static void przyk() {
        Scanner cyfry = new Scanner(System.in);
        System.out.println("Podaj liczbe m: ");
        int m = cyfry.nextInt();
        if (1 > m || m > 10) {
            m = cyfry.nextInt();
        }
        System.out.println("Podaj liczbe n: ");
        int n = cyfry.nextInt();
        if (1 > n || n > 10) {
            n = cyfry.nextInt();
        }
        System.out.println("Podaj liczbe k: ");
        int k = cyfry.nextInt();
        if (1 > k || k > 10) {
            k = cyfry.nextInt();
        }

        int[][] a = new int[m][n];
        int[][] b = new int[n][k];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int r= (int) (Math.random() * ((- -9) + 1));
                a[i][j] = r;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                int r2= (int) (Math.random() * ((- -9) + 1));
                b[i][j] = r2;
            }
        }
        System.out.println("tablica A:");
        wypisz(a);
        System.out.println("tablica B:");
        wypisz(b);
        int[][] c = mnozenie(a,b,m,n,k);
        System.out.println("Tablica C (wynik mnozenia): ");
        wypisz(c);
    }

}
