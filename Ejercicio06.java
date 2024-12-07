
package ejercicio06;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese el nro de filas de la matriz: ");
        int fila = scanner.nextInt();

        System.out.print("Ingrese el nro de columnas de la matriz: ");
        int columna = scanner.nextInt();
 
        int[][] matriz = new int[fila][columna];
      
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }
 
        System.out.println("\nLa matriz generada es:");
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println();
        }  
        
        int totalElementos = fila*columna;
        
        int[] elementosEspiral = new int[totalElementos];
        int indice = 0;
        
        
        int filaInicio = 0;
        int filaFin = fila - 1;
        int columnaInicio = 0;
        int columnaFin = columna - 1;
        
        
        while (filaInicio <= filaFin && columnaInicio <= columnaFin) {
            
            for (int j = columnaInicio; j <= columnaFin; j++) {
                elementosEspiral[indice++] = matriz[filaInicio][j];
            }
            filaInicio++;
            
           
            for (int i = filaInicio; i <= filaFin; i++) {
                elementosEspiral[indice++] = matriz[i][columnaFin];
            }
            columnaFin--;
            
            
            if (filaInicio <= filaFin) {
                for (int j = columnaFin; j >= columnaInicio; j--) {
                    elementosEspiral[indice++] = matriz[filaFin][j];
                }
                filaFin--;
            }
            
            if (columnaInicio <= columnaFin) {
                for (int i = filaFin; i >= filaInicio; i--) {
                    elementosEspiral[indice++] = matriz[i][columnaInicio];
                }
                columnaInicio++;
            }
        }
         
        System.out.println("\nRecorrido en espiral:");
        for (int i = 0; i < elementosEspiral.length; i++) {
            System.out.print(elementosEspiral[i] + " ");
        }
    }
}
