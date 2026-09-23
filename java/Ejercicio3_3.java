import java.util.Scanner;


public class Ejercicio3_3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Ingrese el lado: ");
        double lado = sc.nextDouble();

        double area = lado * lado;

        System.out.println("El área es: " + area);

        sc.close();
    }
}