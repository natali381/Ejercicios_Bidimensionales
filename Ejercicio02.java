package ejercicio02;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese la dimension de la matriz : ");
        int n = scanner.nextInt();

        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(31);
            }
        }

        System.out.println("\nLa matriz generada : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println();
        }

        int[][] matrizRotada = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizRotada[j][n - 1 - i] = matriz[i][j];
            }

        }

        System.out.println("\nMatriz rotada a 90 grados ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + matrizRotada[i][j] + "] ");
            }
            System.out.println();
        }

        System.out.println(" ");
    }

}
