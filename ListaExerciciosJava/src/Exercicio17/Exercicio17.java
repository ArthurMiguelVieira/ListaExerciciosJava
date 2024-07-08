package Exercicio17;

import java.sql.SQLOutput;

//17 - Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius. Imprima na tela as duas temperaturas.
//
//Fórmula: C = (5 * ( F-32) / 9)
public class Exercicio17 {
    public static void main(String[] args) {
        double celsius = 34;
        final double FORMULA_CALCULAR_FAHRENHEIT = ((celsius*1.8)+32);

        System.out.println("Temperatura em C "+celsius);
        System.out.println("Temperatura em F "+ FORMULA_CALCULAR_FAHRENHEIT);
    }
}
