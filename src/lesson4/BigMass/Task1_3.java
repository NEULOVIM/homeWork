package lesson4.BigMass;


import java.util.Random;
import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mass = new int[n][m];

        for (int i = 0; i < mass.length; i++) {
            System.out.println();
            for (int j = 0; j < mass.length; j++) {
                mass[i][j] = r.nextInt(100);
                System.out.print(mass[i][j] + " ");
            }
        }
        System.out.println("\n");


        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i][i] + " ");
        }
        System.out.println();

        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i][mass.length - 1 - i] + " ");
        }

    }
}