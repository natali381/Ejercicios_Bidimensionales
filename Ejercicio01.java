
package ejercicio01;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio01 {

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
        
        int DPrincipal=0;
        int DSecundaria=0;
        
        for (int i = 0; i < n; i++) {
                DPrincipal = DPrincipal+ matriz[i][i] ;     
                DSecundaria = DSecundaria + matriz[i][n-i-1];
        }
        
        System.out.println("\nSuma de la diagonal principal: "+ DPrincipal);
        System.out.println("Suma de la diagonal secundaria: "+ DSecundaria);
        System.out.println(" ");
    }
    
}
