import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CuentaCorriente cuenta1 = new CuentaCorriente(500, "Juan");
        CuentaCorriente cuenta2 = new CuentaCorriente(1000, "Pedro");

        cuenta2.Transferencia(cuenta1, 100);
        cuenta1.MostrarDatosGenerales();
    }
}

class CuentaCorriente {
    private double saldo;
    private String nombreTitular;
    private long numeroCuenta;


    //CONSTRUCTOR:
    public CuentaCorriente(double saldo, String nombreTitular) {
        this.saldo = saldo;
        this.nombreTitular = nombreTitular;
    }

    //METODOS:
    public void Ingresos(double cantidad) {
        this.saldo += cantidad;
    }

    public void Reintegro(double cantidad) {
        this.saldo -= cantidad;
    }

    public void MostrarSaldo() {
        System.out.println("El saldo de la cuenta es: " + this.saldo);
    }

    public void MostrarDatosGenerales() {
        System.out.println("El nombre del titular es: " + this.nombreTitular);
        System.out.println("El numero de cuenta es: " + this.numeroCuenta);
        System.out.println("El saldo de la cuenta es: " + this.saldo);
    }

    public void Transferencia(CuentaCorriente cuentaDestino, double cantidad) {
        this.saldo -= cantidad;
        cuentaDestino.saldo += cantidad;
    }
}
