package Clase2508;

import javafx.util.Pair;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class UsoCuenta {
    public static void main(String[] args) {

        System.out.println("Cuenta Bancaria 1");
        Pair<String, Double> datos = pedirDatos();
        CuentaCorriente cuenta1 = new CuentaCorriente(datos.getKey(), datos.getValue());

        System.out.println("Cuenta Bancaria 2");
        datos = pedirDatos();
        CuentaCorriente cuenta2 = new CuentaCorriente(datos.getKey(), datos.getValue());

        Double importe = pedirImporteUsuario();
        CuentaCorriente.tranferencia(cuenta1,cuenta2,importe);

        System.out.println("Datos de la Cuenta 1");
        List<String> datosCuenta;
        datosCuenta = cuenta1.getDatosGeneralesCC();
        System.out.println("Titular: "+ datosCuenta.get(0));
        System.out.println("N° de Cuenta: "+ datosCuenta.get(1));
        System.out.println("Saldo: "+ datosCuenta.get(2));

        System.out.println("Datos de la Cuenta 2");
        datosCuenta = cuenta2.getDatosGeneralesCC();
        System.out.println("Titular: "+ datosCuenta.get(0));
        System.out.println("N° de Cuenta: "+ datosCuenta.get(1));
        System.out.println("Saldo: "+ datosCuenta.get(2));


    }
    public void pedirDatos(String, Double){
        System.out.println("Ingrese nombre del titular: ");
        Scanner entradaEscaner = new Scanner(System.in);
        String titular = entradaEscaner.nextLine();
        Double saldo = 0.0;
        System.out.println("Ingrese el saldo inicial: ");

        while (!entradaEscaner.hasNextDouble()){
            System.out.println("Ingrese un saldo correcto.\n"+"Vuelva a intentarlo (Solo numeros decimales): ");
            entradaEscaner.nextLine();
        }
        saldo = entradaEscaner.nextDouble();
        return new Pair<>(titular, saldo);
    }


    public static Double pedirImporteUsuario() {
        //Pedimos el importe al usuario por consola
        Scanner entradaEscaner = new Scanner (System.in); //Creamos de un objeto Scanner
        Double importe = 0.0;
        System.out.print ("\nIntroduzca el importe a transferir entre cuentas: ");
        //Comprueba que sólo se introduzcan números válidos (Double)
        while(!entradaEscaner.hasNextDouble())
        {
            System.out.print("No ha introducido un importe correcto.\n" +
                    "Vuelva a intentarlo (sólo números y decimales): ");
            entradaEscaner.nextLine();
        }
        importe = entradaEscaner.nextDouble();
        entradaEscaner.close();
        return importe;
    }

}

class CuentaCorriente{
    private String nombreTitular;
    private Double saldo;
    private long numeroCuenta;

    public CuentaCorriente(String nombreTitular, Double saldo) {
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
        Random numCuentaAleat = new Random();
        this.numeroCuenta = Math.abs(numCuentaAleat.nextLong());
    }

    //SETTERS
    public void setIngreso(Double ingreso) {
        if (ingreso <= 0){
            System.out.println("El ingreso debe ser mayor a $0");
        } else {
            saldo = saldo + ingreso;
        }
    }

    public void  setReintegro(Double reintegro){
        if (reintegro <= 0){
            System.out.println("El reintegro debe ser mayor a $0");
        }else {
            saldo = saldo - reintegro;
        }
    }

    //GETTERS
    public Double getSaldo(){
        return saldo;
    }

    public List<String> getDatosGeneralesCC(){
        List<String> datosCuentaC = new ArrayList<>();
        datosCuentaC.add(nombreTitular);
        datosCuentaC.add(Long.toString(numeroCuenta));

        DecimalFormat saldoRedondeado = new DecimalFormat("###.##");
        datosCuentaC.add(saldoRedondeado.format(saldo));

        return datosCuentaC;
    }

    //METODO DE TRANFERENCIA
    public static void tranferencia(CuentaCorriente cuenta1, CuentaCorriente cuenta2, Double importeTranferencia){
        //Double importeTranferencia = 2500;
        cuenta1.saldo = cuenta1.saldo - importeTranferencia;
        cuenta2.saldo = cuenta2.saldo + importeTranferencia;
    }

}