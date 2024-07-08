package Exercicio21;

import java.util.Random;

//21 - Faça um algoritmo que mostre um valor aleatório entre 0 e 100.
public class Exercicio21 {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println(random.nextInt(101));
    }
}
