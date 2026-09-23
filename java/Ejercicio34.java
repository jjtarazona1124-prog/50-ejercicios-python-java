import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la velocidad de la onda (m/s): ");
        double velocidad = sc.nextDouble();

        System.out.print("Ingrese la longitud de la onda (m): ");
        double longitud = sc.nextDouble();

        double frecuencia = velocidad / longitud ;

        System.out.println("la frecuencia de la onda es (hz): " + frecuencia);

        sc.close();
    }
}