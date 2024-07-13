/*
Crea un programa que mire dentro de un array, si hay elementos repetidos y los cuente e imprima en pantalla en orden del elemento que más se repite al que menos.
*/

import java.util.Scanner;

public class MatrizSimetrica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor ingresa el tamaño de la matriz (n x n): ");
        int n = scanner.nextInt();

        int[][] matriz = new int[n][n];
        System.out.println("Por favor ingresa los elementos de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        boolean esSimetrica = esSimetrica(matriz, n);

        if (esSimetrica) {
            System.out.println("La matriz es simétrica.");
        } else {
            System.out.println("La matriz no es simétrica.");
        }

        scanner.close();
    }

    public static boolean esSimetrica(int[][] matriz, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}

