/*
Crea un array de Strings (por ejemplo, nombres) y pide al usuario que ingrese un nombre. Busca ese nombre en el array que imprima si se encuentra la posición y si no un mensaje que no se encuentra
*/

import java.util.Scanner;

public class BusquedaPorCoincidenciaEnArrays {
    public static void main(String[] args) {
        String[] nombres = {"Serna", "Mateo", "George", "Zuluaga", "Nicolas"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor ingrese un nombre: ");
        String nombreBuscado = scanner.nextLine();

        int posicion = -1;

        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equalsIgnoreCase(nombreBuscado)) {
                posicion = i;
                break;
            }
        }

        if (posicion != -1) {
            System.out.println("El nombre '" + nombreBuscado + "' se encuentra en la posición: " + posicion);
        }
        else {
            System.out.println("El nombre '" + nombreBuscado + "' no se encuentra en el array.");
        }

        scanner.close();
    }
}