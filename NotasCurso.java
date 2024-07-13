/*
Crea un programa que calcula la calificación promedio que se necesita obtener en las notas faltantes de un curso para aprobarlo, considerando la cantidad de calificaciones totales, las calificaciones ya obtenidas, el puntaje mínimo requerido para aprobar y la cantidad de notas faltantes. Importante: el total de notas del curso será de 8 notas, la calificación será de 0 a 100 y el promedio mínimo para aprobar el curso es de 76
*/

import java.util.Scanner;

public class NotasCurso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cantidadNotas = 8;
        double puntajeMinimo = 76.0;

        double[] notasObtenidas = new double[cantidadNotas];
        double sumaNotasObtenidas = 0;
        int cantidadNotasObtenidas;

        System.out.print("Ingrese la cantidad de calificaciones ya obtenidas: ");
        cantidadNotasObtenidas = scanner.nextInt();

        System.out.println("Ingrese las calificaciones ya obtenidas:");
        for (int i = 0; i < cantidadNotasObtenidas; i++) {
            System.out.print("Calificación " + (i + 1) + ": ");
            notasObtenidas[i] = scanner.nextDouble();
            sumaNotasObtenidas += notasObtenidas[i];
        }

        double sumaTotalNecesaria = puntajeMinimo * cantidadNotas;

        double sumaNotasFaltantesNecesaria = sumaTotalNecesaria - sumaNotasObtenidas;
        int cantidadNotasFaltantes = cantidadNotas - cantidadNotasObtenidas;
        double calificacionPromedioNecesaria = sumaNotasFaltantesNecesaria / cantidadNotasFaltantes;

        if (calificacionPromedioNecesaria <= 100 && calificacionPromedioNecesaria >= 0) {
            System.out.printf("La calificación promedio que necesita obtener en las %d notas faltantes es: %.2f\n", cantidadNotasFaltantes, calificacionPromedioNecesaria);
        }
        else {
            System.out.println("No es posible aprobar el curso con las calificaciones faltantes.");
        }

        scanner.close();
    }
}
