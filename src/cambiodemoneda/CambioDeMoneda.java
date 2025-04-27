/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cambiodemoneda;
import java.util.Scanner;
/**
 *
 * @author Sebastian
 */
public class CambioDeMoneda {
    
    public static double Dolar;
    public static double Euro;
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Ingresa el tipo de cambio del dolar de hoy: ");
        Dolar = scanner.nextDouble();
        
        System.out.print("Ingrese el tipo de cambio del euro de hoy:  ");
        Euro = scanner.nextDouble();
        int opcion;
        double cantidad;
        
        do {    
            System.out.println("Bienvenido al Conversor de monedas ");
            System.out.println("1. Soles a Dolares ");
            System.out.println("2. Soles a Euros ");
            System.out.println("3. Dolares a Soles ");
            System.out.println("4. Euros a Soles ");
            System.out.println("5. Salir ");
            System.out.println("Ingrese la opcion que desea ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1 -> {
                    System.out.println("Ingrese la cantidad de soles");
                    cantidad = scanner.nextDouble();
                    System.out.printf("Equivale a: $%.2f\n", solesADolares(cantidad));
                }
                    case 2 -> {
                        System.out.print("Ingrese la cantidad en Soles: ");
                        cantidad = scanner.nextDouble();
                        System.out.printf("Equivale a: €$%.2f\n", solesAEuros(cantidad));
                }
                case 3 -> {
                    System.out.print("Ingrese la cantidad en Dolares: ");
                    cantidad = scanner.nextDouble();
                    System.out.printf("Equivale a: S/.%.2f\n",  dolaresASoles(cantidad));
                }
                case 4 -> {
                    System.out.print("Ingrese la cantidad en Euros: ");
                    cantidad = scanner.nextDouble();
                    System.out.printf("Equivale a: S/.%.2f\n", eurosASoles(cantidad));
                }
                case 5 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción inválida.");
            }
        }while (opcion != 5);
        scanner.close();
    }
        
    public static double solesADolares(double soles) {
        return soles / Dolar;
    }

    public static double solesAEuros(double soles) {
        return soles / Euro;
    }

    public static double dolaresASoles(double dolares) {
        return dolares * Dolar;
    }

    public static double eurosASoles(double euros) {
        return euros *  Euro;
    }
}
