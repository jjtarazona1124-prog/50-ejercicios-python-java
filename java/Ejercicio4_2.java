import java.util.Scanner;


public class Ejercicio4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    

        System.out.print("Ingrese la temperatura en Celsius: ");
        double celsius = sc.nextDouble();

        double kelvin = celsius + 273.15;

        System.out.println("La temperatura en Kelvin es: " + kelvin);

        sc.close();
    }
}