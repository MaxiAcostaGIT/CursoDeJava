import java.util.*;

public class Ejercicio_6_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Programa que usa la funcion exponencial y su inversa");
        System.out.print("Introduce X en la funcion Primera (e^x): ");
        double x = sc.nextDouble();

        System.out.println("f(x) = " + Math.exp(x));
        System.out.println("f^-1(x) = " + Math.log(x));
    }
}
