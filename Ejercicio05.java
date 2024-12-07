
package ejercicio05;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese la dimension de la matriz : ");
        int n = scanner.nextInt();

        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }

        System.out.println("\nLa matriz generada es:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println();
        }

        int[][] transpuesta = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }

        int c = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] == transpuesta[i][j]) {
                    c++;
                }
            }
        }

        if (c == n * n) {
            System.out.println("\nLa matriz es simetrica");
        } else {
            System.out.println("\nLa matriz no es simetrica");
        }
        System.out.println(" ");
    }

}
