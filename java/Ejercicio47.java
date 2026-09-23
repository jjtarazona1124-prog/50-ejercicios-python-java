import java.util.Scanner;


public class Ejercicio47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        final double h = 6.626e-34;

        System.out.print("Ingrese la frecunencia de la onda (hz): ");
        double frecunencia = sc.nextDouble();

         double energia_del_foton = frecunencia * h;

         
        System.out.println("la energia del foton es : " + energia_del_foton + " joules");

        sc.close();
    }
}