
package ejercicio07;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
       
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese la dimension de la matriz : ");
        int n = scanner.nextInt();

        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(101);
            }
        }

        System.out.println("\nLa matriz generada es:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println();
        }

        int numAnillos = (n + 1) / 2;
        System.out.println("\nLa matriz tiene " + numAnillos + " anillos");

        System.out.print("Ingrese el numero de anillo a sumar (1-" + numAnillos + "): ");
        int anillo = scanner.nextInt();

        if (anillo > 0 && anillo <= numAnillos) {

            int i = anillo - 1;
            int inicioFila = i;
            int finFila = n - i - 1;
            int inicioColumna = i;
            int finColumna = n - i - 1;

            int suma = 0;

            for (int j = inicioColumna; j <= finColumna; j++) {
                suma += matriz[inicioFila][j];
                if (inicioFila != finFila) {
                    suma += matriz[finFila][j];
                }
            }

            for (int k = inicioFila + 1; k < finFila; k++) {
                suma += matriz[k][inicioColumna];
                if (inicioColumna != finColumna) {
                    suma += matriz[k][finColumna];
                }
            }

            System.out.println("\nLa suma del anillo " + anillo + " es: " + suma);
        } else {
            System.out.println("Error: El anillo debe estar entre 1 y " + numAnillos);
        }
        
    }
    
}
