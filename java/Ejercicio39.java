import java.util.Scanner;


public class Ejercicio39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Ingrese la constante elástica del resorte (N/m): ");
        double k = sc.nextDouble();

        System.out.print("Ingrese la deformación del resorte (m): ");
        double x = sc.nextDouble();

        double energiaPotencial = 0.5 * k * Math.pow(x, 2);

        System.out.println("La energía potencial elástica es: " + energiaPotencial + " Joules");

        sc.close();
    }
}
