import java.util.Scanner;

public class Ejercicio3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el lado del cuadrado: ");
        double lado = sc.nextDouble();

        double area = lado * lado;

        System.out.println("El área del cuadrado es: " + area);

        sc.close();
    }
}