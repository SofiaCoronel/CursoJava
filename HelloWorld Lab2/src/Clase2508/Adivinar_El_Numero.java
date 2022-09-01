package Clase2508;

import javax.swing.*;

public class Adivinar_El_Numero {
    public static void main(String[] args) {
        int numero;
        int contador = 0;
        int aleatorio;

        aleatorio = (int)(Math.random()*100);

        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));

            if (aleatorio > numero){
                System.out.println("Ingrese un numero MAYOR.");
            } else{
                System.out.println("Ingrese un numero MENOR.");
            }
            contador++;

        }while (numero != aleatorio);

        System.out.println("Correcto! \nAdivinaste el numero en: "+contador+" intentos.");
    }
}
