import java.util.Scanner;

public class Ejercicio42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Ingrese la masa de la particula (kg): ");
        double masa = sc.nextDouble();

          System.out.print("Ingrese la velocidad de la particula  (m/s): ");
        double velocidad = sc.nextDouble();

  
        final double h= 6.626e-34;
        
        double longitud =   h  / (masa*velocidad);  

        System.out.println("La longitud de la onda es: " + longitud + "m");

        sc.close();
    }
}