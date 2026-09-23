import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número binario: ");
        String binario = sc.nextLine();

        int decimal = Integer.parseInt(binario, 2);

        System.out.println("El número decimal es: " + decimal);

        sc.close();
    }
}    

