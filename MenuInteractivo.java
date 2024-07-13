/*
Este ejercicio propone la creación de un programa que presente al
usuario un menú interactivo para realizar operaciones matemáticas
básicas como suma, resta, multiplicación y división.
 */

import java.util.Scanner;

public class MenuInteractivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
         
        do {
            System.out.println("Menú de Operaciones Matemáticas");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            System.out.println("Elija una opción: ");
            
            opcion = scanner.nextInt();
            
            if (opcion >= 1 && opcion <= 4) {
                System.out.println("Ingrese el primer número: ");
                double numero1 = scanner.nextDouble();
                System.out.println("Ingrese el segundo número: ");
                double numero2 = scanner.nextDouble();
                 
                switch (opcion) {
                    case 1:
                       System.out.println("El resultado de la suma es: " + (numero1 + numero2));
                       break;
                    case 2:
                       System.out.println("El resultado de la resta es: " + (numero1 - numero2));
                       break;
                    case 3:
                       System.out.println("El resultado de la multiplicación es: " + (numero1 * numero2));
                       break;
                    case 4:
                        System.out.println("El resultado de la división es: " + (numero1 / numero2));
                        break;
                }
            } 
            else if(opcion != 5) {
                System.out.println("Ingresaste un dato erroneo, intente nuevamente");
            }
             
        } while (opcion != 5);

        System.out.println("FIN");

        scanner.close();
    }
}
 