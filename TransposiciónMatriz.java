/*
Crea un programa en Java que calcule la transpuesta de una matriz(intercambiar filas por columnas).
*/

import java.util.Scanner;

public class TransposiciónMatriz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor ingresa el número de filas: ");
        int filas = scanner.nextInt();
        System.out.print("Por favor ingres el número de columnas: ");
        int columnas = scanner.nextInt();

        int[][] matriz = new int[filas][columnas];
        System.out.println("Por favor ingresa los elementos de la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        int[][] transpuesta = new int[columnas][filas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }

        System.out.println("La matriz transpuesta es:");
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.print(transpuesta[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

