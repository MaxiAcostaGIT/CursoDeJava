import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        int altura;
        String sexo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu altura en centimetros: ");
        altura = sc.nextInt();
        System.out.println("Introduce tu sexo (h/m): ");
        sexo = sc.next();

        if (sexo.equals("h")) {
            System.out.println("Tu peso ideal es: " + (altura - 110) + " kg");
        } else {
            System.out.println("Tu peso ideal es: " + (altura - 120) + " kg");
        }
    }
}
