/*
Crea un programa que calcule los descuentos por compras(Ejercicio 2) en una tienda, donde se aplica un porcentaje de descuento en función del monto total de la compra, con rangos de precios personalizados 
*/

import java.util.Scanner;

public class CalculadoraDescuentos {
    public static void main(String[] args) {

        System.out.println("Bienvenido a la Tienda Electrónica");
        
        String[] productos = {"computadores", "celulares", "televisores", "audífonos", "tablets"};
        double[] precios = {2650000, 800000, 1100000, 80000, 1700000};

        int[] cantidad = new int[productos.length];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < productos.length; i++){
            System.out.println("¿Cuántos " + productos[i] + " desea comprar?: ");
            cantidad[i] = scanner.nextInt();
        }

        double facturaTotal = 0.0;
        
        for (int i = 0; i < productos.length; i++){
            facturaTotal += cantidad[i] * precios[i];
        }

        double descuento = 0.0;

        if (facturaTotal >= 5000000) {
            descuento = 0.10;
        }
        else if (facturaTotal >= 3000000) {
            descuento = 0.07;
        }
        else if (facturaTotal >= 1000000) {
            descuento = 0.05; 
        }
        else if (facturaTotal >= 500000) {
            descuento = 0.03; 
        }

        double montoDescuento = facturaTotal * descuento;
        double totalConDescuento = facturaTotal - montoDescuento;

        System.out.println("El valor total de la factura sin descuento es: " + facturaTotal);
        System.out.println("Se ha aplicado un descuento de: " + (descuento * 100) + "%");
        System.out.println("El valor del descuento es: " + montoDescuento);
        System.out.println("El valor total de la factura con descuento es: " + totalConDescuento);

        scanner.close();
    }
}
