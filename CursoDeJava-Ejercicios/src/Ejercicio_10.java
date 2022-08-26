import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adivina un numero del 1 al 100: ");
        int numero = sc.nextInt();
        int intentos = 0;
        int numeroAleatorio = (int) (Math.random() * 100) + 1;
        while (numero != numeroAleatorio) {
            intentos++;
            if (numero > numeroAleatorio) {
                System.out.println("El numero es menor");
            } else {
                System.out.println("El numero es mayor");
            }
            System.out.println("Intenta de nuevo: ");
            numero = sc.nextInt();
        }
        System.out.println("Has acertado el numero en " + intentos + " intentos");
    }
}
