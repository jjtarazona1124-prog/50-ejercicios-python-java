import java.util.Scanner;


public class Ejercicio5_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       

        System.out.print("Ingrese el lado del hexágono: ");
        double lado = sc.nextDouble();

        double perimetro = 6 * lado;

        System.out.println("El perímetro del hexágono es: " + perimetro);

        sc.close();
    }
}