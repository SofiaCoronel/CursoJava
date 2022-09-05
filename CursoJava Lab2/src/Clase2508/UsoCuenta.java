package Clase2508;

import java.util.Scanner;
import java.util.Random;

public class UsoCuenta {
    public UsoCuenta() {
    }

    public static void main(String[] args) {
        Scanner nom = new Scanner(System.in);

        System.out.println("Ingrese nombre titular Cuenta 1:");
        String nombre = nom.next();

        CuentaCorriente Cuenta1 = new CuentaCorriente(nombre, 1000.0D);
        System.out.println("Ingrese nombre titular Cuenta 2:");
        nombre = nom.next();

        CuentaCorriente Cuenta2 = new CuentaCorriente(nombre, 1000.0D);
        Cuenta1.ingreso(4000.0D);

        System.out.println("Antes de la transferencia:");
        System.out.println("Cuenta 1:");
        System.out.println(Cuenta1.toString());
        System.out.println("Cuenta 2:");
        System.out.println(Cuenta2.toString());

        double transf = 2500.0D;

        Cuenta1.transferir(Cuenta2, transf);
        System.out.println("Despues de la transferencia:");
        System.out.println("Cuenta 1:");
        System.out.println(Cuenta1.toString());
        System.out.println("Cuenta 2:");
        System.out.println(Cuenta2.toString());
    }
}

class CuentaCorriente {
    private long numeroCuenta;
    private String nombreTitular;
    private double saldo;

    public CuentaCorriente(String nombreTitular, double saldo) {
        Random ran = new Random();
        this.numeroCuenta = ran.nextLong(1000000L);
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String toString() {
        return "CuentaCorriente: NumeroCuenta =" + this.numeroCuenta + ", nombre del Titular ='" + this.nombreTitular + "', saldo =" + this.saldo + ".";
    }

    public void ingreso(double importe) {
        this.saldo += importe;
    }

    public void reintegro(double importe) {
        this.saldo -= importe;
    }

    public void transferir(CuentaCorriente cuenta, double importe) {
        cuenta.ingreso(importe);
        this.reintegro(importe);
    }
}

