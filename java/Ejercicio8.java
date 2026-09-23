import java.util.Scanner;


public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Ingrese la longitud en metros: ");
        double metros = sc.nextDouble();

        double pies = metros * 3.28084;

        System.out.println("La longitud en pies es: " + pies);

        sc.close();
    }
}