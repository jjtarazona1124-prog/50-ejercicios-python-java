import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Ingrese la densidad del fluido (kg/m³): ");
        double densidad = sc.nextDouble();

        final double gravedad = 9.8;

        System.out.print("Ingrese la profundidad (m): ");
        double profundidad = sc.nextDouble();

        double presion = densidad * gravedad * profundidad;

        System.out.println("La presión hidrostática es: " + presion + " Pascales");

        sc.close();
    }
}