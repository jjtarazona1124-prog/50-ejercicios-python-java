import java.util.Scanner;


public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    

        System.out.print("Ingrese el radio del círculo: ");
        double radio = sc.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("El área del círculo es: " + area);

        sc.close();
    }
}