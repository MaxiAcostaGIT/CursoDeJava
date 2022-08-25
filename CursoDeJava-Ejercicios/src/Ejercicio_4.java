import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();
        System.out.println("Ingrese su salario: ");
        double salario = sc.nextDouble();
        System.out.println("Tiene carnet? (si/no)");
        String carnet = sc.next();
        System.out.println("\nNombre: " + nombre + "\nEdad: " + edad + "\nSalario: " + salario + "\nCarnet: " + carnet);
    }
}
