/*
Un programa que permita al usuario ingresar un texto y luego le da la opción de buscar una palabra específica, mostrando como resultado el rango de posiciones donde se encontró la palabra exacta. (Sin darle importancia a mayúsculas o minúsculas)
*/

import java.util.ArrayList;
import java.util.Scanner;

public class BuscarPalabra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor ingrese un texto: ");
        String texto = scanner.nextLine();
        
        System.out.println("Por favor ingrese la palabra a buscar:");
        String palabra = scanner.nextLine();
        
        String textoMinusculas = texto.toLowerCase();
        String palabraMinusculas = palabra.toLowerCase();
        
        String[] palabras = textoMinusculas.split("\\s+");
        
        ArrayList<Integer> posiciones = new ArrayList<>();
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equals(palabraMinusculas)) {
                posiciones.add(i);
            }
        }
        
        if (posiciones.size() > 0) {
            System.out.println("La palabra '" + palabra + "' se encontró en las siguientes posiciones:");
            for (int pos : posiciones) {
                System.out.println("Posición: " + pos);
            }
        }
        else {
            System.out.println("La palabra '" + palabra + "' no se encontró en el texto.");
        }
        
        scanner.close();
    }
}