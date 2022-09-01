package Clase2508;

import java.util.Scanner;

public class RaizScanner {
    public static void main(String[] args){
        double numero;
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        numero = s.nextDouble();

        System.out.println("La raiz de "+numero+" es = "+Math.sqrt(numero));
    }
}

