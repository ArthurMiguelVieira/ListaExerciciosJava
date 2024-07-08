package Exercicio18;
//18 - Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano.
// Faça um algoritmo que calcule e imprima na tela em quantos anos serão necessários para que Francisco seja maior que Sara.
public class Exercicio18 {
    public static void main(String[] args) {
        double alturaFrancisco = 1.5;
        int anosNecessarios = 0;
        for (double i = 1.1; i < alturaFrancisco; i+=0.3) {
            alturaFrancisco+=0.2;
            anosNecessarios++;
        }

        System.out.println("Levou "+anosNecessarios+ " para que sara ficasse mais alta que francisco");

    }
}
