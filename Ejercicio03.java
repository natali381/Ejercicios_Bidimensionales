
package ejercicio03;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio03 {

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

        System.out.println("\nLa matriz generada es:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println();
        }
        int Sperimetro = 0;

        // Fila superior
        for (int j = 0; j < n; j++) {
            Sperimetro = Sperimetro + matriz[0][j];
        }

        // Fila inferior
        for (int j = 0; j < n; j++) {
            Sperimetro = Sperimetro + matriz[n - 1][j];
        }

        // Columna izquierda 
        for (int i = 1; i < n - 1; i++) {
            Sperimetro = Sperimetro + matriz[i][0];
        }

        // Columna derecha 
        for (int i = 1; i < n - 1; i++) {
            Sperimetro = Sperimetro + matriz[i][n - 1];
        }

        System.out.println("\nSuma del perimetro: " + Sperimetro);
        System.out.println(" ");
    }

}
