import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int numero = sc.nextInt();

        RaizScanner raiz = new RaizScanner(numero);
        raiz.raizCuadrada();
    }
}

class RaizScanner {
    // ATRIBUTOS:
    private int num;

    //CONSTRUCTOR:
    public RaizScanner(int num) {
        this.num = num;
    }

    //METODOS:
    public void raizCuadrada() {
        System.out.println("La raiz cuadrada de " + num + " es " + Math.sqrt(num));
    }
}
