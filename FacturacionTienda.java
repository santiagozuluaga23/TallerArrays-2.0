/*
Un cliente realiza una compra en una tienda. El programa proporciona un array de productos y un array de precios. Se requiere pedir al usuario la cantidad de cada producto que desea comprar, para posteriormente imprimir el valor total de la factura.
*/

import java.util.Scanner;

public class FacturacionTienda {
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

        System.out.println("El valor total de la factura es: " + facturaTotal);

        scanner.close();
    }
}
