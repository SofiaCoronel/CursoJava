package Clase1808;

public class TP5Lab2 {
    public static void main(String[] args) {

        double num6=6.0;
        double num5=5.0;
        double num2=2.0;
        double num3=3.0;
        double num7=7.0;
        double num30=30.0;
        double num1=1.0;

        double mult= num2/num3 * num7/num2;
        double resta= num6/num5 - mult;
        double suma= num2/num30 + resta;
        double div=(num1/num3)/num5;

        double numerador, denominador, resultado;
        numerador=suma;
        denominador=div;
        resultado=numerador/denominador;

        System.out.println(Math.round(resultado));

    }
}
