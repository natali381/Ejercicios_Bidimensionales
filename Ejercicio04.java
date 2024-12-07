
package ejercicio04;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese el nro de filas de la matriz : ");
        int fila = scanner.nextInt();

        System.out.print("Ingrese el nro de columnas de la matriz : ");
        int columna = scanner.nextInt();

        int[][] matriz = new int[fila][columna];
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                matriz[i][j] = random.nextInt(31);
            }
        }

        System.out.println("\nLa matriz generada es:");
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println();
        }

        int[][] transpuesta = new int[columna][fila];

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }

        System.out.println("\nMatriz transpuesta: ");
        for (int i = 0; i < columna; i++) {
            for (int j = 0; j < fila; j++) {
                System.out.print("[" + transpuesta[i][j] + "] ");
            }
            System.out.println();
        }
        System.out.println(" ");
    }

}
