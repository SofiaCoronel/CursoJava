package Clase1808;
import javax.swing.*;

import static javax.swing.JOptionPane.showInputDialog;

public class TP4Lab2 {
    public static void main(String[] args) {
        String nombre = showInputDialog("Ingresa tu nombre:");
        String carnet;
        int edad = Integer.parseInt(showInputDialog("Ingresa tu edad:"));
        double salario = Double.parseDouble(showInputDialog("Lo que te gustaría ganar por mes y que sea con centavos."));
        if (edad >= 18) {
            JOptionPane.showMessageDialog(null, nombre + "\n"+ "Tiene " + edad + " años.\n" +
                    "Le gustaria que su salario sea de $" + salario + " al mes\n" + "Puede tener carnet por ser mayor de edad.");
        } else {
            JOptionPane.showMessageDialog(null, nombre + "\n"+ "Tiene " + edad + " años.\n" +
                    "Le gustaria que su salario sea de $" + salario + " al mes\n" + "No puede tener carnet por ser menor de edad.");

        }
    }
}

