import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Ingrese el valor de la primera resistencia (Ω): ");
        double r1 = sc.nextDouble();

        System.out.print("Ingrese el valor de la segunda resistencia (Ω): ");
        double r2 = sc.nextDouble();

        System.out.print("Ingrese el valor de la tercera resistencia (Ω): ");
        double r3 = sc.nextDouble();

        double resistenciaTotal = r1 + r2 + r3;

        System.out.println("La resistencia total en serie es: " + resistenciaTotal + " Ohmios");

        sc.close();
    }
}