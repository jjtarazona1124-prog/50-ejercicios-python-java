import java.util.Scanner;


public class Ejercicio45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        final double epsilon0 = 8.854e-12;

        System.out.print("Ingrese la permitividad relativa del material (1 para vacío/aire): ");
        double epsilonR = sc.nextDouble();

        System.out.print("Ingrese el área de las placas (m²): ");
        double area = sc.nextDouble();

        System.out.print("Ingrese la distancia entre las placas (m): ");
        double distancia = sc.nextDouble();

        double capacitancia = epsilon0 * epsilonR * area / distancia;

        System.out.println("La capacitancia es: " + capacitancia + " Faradios");

        sc.close();
    }
}