import java.util.Scanner;


public class Ejercicio4_1{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Ingrese la temperatura en Celsius: ");
       
       double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("La temperatura en Fahrenheit es: " + fahrenheit);

        sc.close();
    }
}