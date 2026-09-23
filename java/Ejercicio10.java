import java.util.Scanner;


public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Ingrese el valor de la primera variable: ");
        double a = sc.nextDouble();

        System.out.print("Ingrese el valor de la segunda variable: ");
        double b = sc.nextDouble();

        System.out.println("Antes del intercambio: a = " + a + ", b = " + b);

        double temp = a;
        a = b;
        b = temp;

        System.out.println("Después del intercambio: a = " + a + ", b = " + b);

        sc.close();
    }
}