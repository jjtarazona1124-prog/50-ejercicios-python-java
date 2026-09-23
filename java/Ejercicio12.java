import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de minutos: ");
        int minutosTotales = sc.nextInt();

        int horas = minutosTotales / 60;
        int minutosRestantes = minutosTotales % 60;

        System.out.println("Equivale a " + horas + " horas y " + minutosRestantes + " minutos");

        sc.close();
    }
}