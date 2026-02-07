package Ejercicios;

// Clase CuentaBancaria con ingresar(), retirar() y mostrarSaldo().
public class Ejercicio33 {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("Juan");
        CuentaBancaria cuenta2 = new CuentaBancaria("María");

        System.out.println(cuenta1.getTitular() + " saldo inicial: " + cuenta1.getSaldo());
        System.out.println(cuenta2.getTitular() + " saldo inicial: " + cuenta2.getSaldo());

        cuenta1.ingresar(200);
        cuenta2.ingresar(500);

        System.out.println(cuenta1.getTitular() + " después de ingresar: " + cuenta1.getSaldo());
        System.out.println(cuenta2.getTitular() + " después de ingresar: " + cuenta2.getSaldo());

        cuenta1.retirar(50);
        cuenta2.retirar(600);

        System.out.println(cuenta1.getTitular() + " después de retirar: " + cuenta1.getSaldo());
        System.out.println(cuenta2.getTitular() + " después de retirar: " + cuenta2.getSaldo());
    }
}

class CuentaBancaria {

    private String titular;
    private double saldo;

    public CuentaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    public String getTitular() {
        return this.titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if (saldo - cantidad >= 0) {
                saldo -= cantidad;
            } else {
                saldo = 0;
            }
        }
    }

    public void mostrarSaldo() {
        System.out.println("Saldo actual de " + titular + ": " + saldo);
    }
}