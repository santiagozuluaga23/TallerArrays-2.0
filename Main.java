/*
Investigación 1: ArrayList
Investigar que es un arraylists y hacer ejemplos con los tipos de datos que se han visto hasta el momento, también mirar los métodos que tienen y hacer ejemplos.
----------------------------------------------------------------------------------------------------
Un ArrayList es una clase en Java que proporciona una implementación de un array dinámico. A diferencia de los arrays tradicionales, los ArrayList pueden cambiar de tamaño dinámicamente cuando se añaden o eliminan elementos. Esta clase forma parte del paquete java.util

Las características principales de ArrayList:
Capacidad dinámica: Se redimensiona automáticamente cuando se añade o elimina un elemento.
Mantenimiento del orden de inserción: Los elementos en un ArrayList mantienen el orden en que se insertaron.
Acceso aleatorio: Permite acceder a cualquier elemento en tiempo constante usando un índice.
*/

//Ejemplos con tipos de datos básicos
//1. ArrayList de enteros

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();


        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        int num = numeros.get(1); 
        System.out.println("Elemento en índice 1: " + num);

        numeros.remove(0);

        System.out.println("Elementos en la lista: " + numeros);
    }
}



//2. ArrayList de cadenas (String)

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> palabras = new ArrayList<>();

        palabras.add("Hola");
        palabras.add("Mundo");
        palabras.add("Java");

        String palabra = palabras.get(2);
        System.out.println("Elemento en índice 2: " + palabra);

        palabras.remove("Mundo");

        System.out.println("Elementos en la lista: " + palabras);
    }
}

//3. ArrayList de booleanos (Boolean)

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Boolean> valores = new ArrayList<>();

        // Añadir elementos
        valores.add(true);
        valores.add(false);
        valores.add(true);

        boolean valor = valores.get(0);
        System.out.println("Elemento en índice 0: " + valor);

        valores.remove(1); 

        System.out.println("Elementos en la lista: " + valores);
    }
}
