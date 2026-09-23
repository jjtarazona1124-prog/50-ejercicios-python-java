import java.util.Scanner;


public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Ingrese el valor del primer cateto: ");
        double cateto1 = sc.nextDouble();

        System.out.print("Ingrese el valor del segundo cateto: ");
        double cateto2 = sc.nextDouble();

        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        System.out.println("La hipotenusa es: " + hipotenusa);

        sc.close();
    }
}