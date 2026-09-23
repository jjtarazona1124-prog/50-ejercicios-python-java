import java.util.Scanner;


public class Ejercicio6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Ingrese un número: ");
        double numero = sc.nextDouble();

        double resultado = Math.abs(numero);

        System.out.println("El valor absoluto es: " + resultado);

        sc.close();
    }
}