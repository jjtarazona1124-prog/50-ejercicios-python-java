import java.util.Scanner;

public class Ejercicio40{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número decimal: ");
        int decimal = sc.nextInt();

        String hexadecimal = Integer.toHexString(decimal);

        System.out.println("El número en hexadecimal es: " + hexadecimal);

        sc.close();
    }
}
