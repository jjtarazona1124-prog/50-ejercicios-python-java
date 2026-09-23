import java.util.Scanner;

public class Ejercicio5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la base del rectángulo: ");
        double base = sc.nextDouble();

        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = sc.nextDouble();

        double perimetro = 2 * (base + altura);

        System.out.println("El perímetro del rectángulo es: " + perimetro);

        sc.close();
    }
}