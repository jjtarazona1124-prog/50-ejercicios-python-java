import java.util.Scanner;


public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        double numero = sc.nextDouble();

        int signo;

        if (numero > 0) {
            signo = 1;
        } else if (numero < 0) {
            signo = -1;
        } else {
            signo = 0;
        }

        System.out.println("El signo del número es: " + signo);

        sc.close();
    }
}