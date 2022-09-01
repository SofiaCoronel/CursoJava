package Clase2508;

import javax.swing.*;

public class Calcular_Peso {
    public static void main(String[] args) {
        double pesoideal=0;
        int altura;
        String genero;

        altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su altura en cm: "));

        do{
            genero = JOptionPane.showInputDialog("Introduce tu genero (H/M): ");
        }while (genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);

        if (genero.equalsIgnoreCase("H")){
            pesoideal = altura - 110;
        } else if (genero.equalsIgnoreCase("M")){
            pesoideal = altura - 120;
        }
        System.out.println("Tu peso ideal es: "+ pesoideal +" kg.");
    }
}
