package Exercicio14;
//14 - Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na tela os valores.
public class Exercicio14 {
    public static void main(String[] args) {
        int A = 10;
        int B = 20;
        int C = A;

        System.out.println(A +" " +B);
        A = B;
        B = C;
        System.out.println(A +" " +B);

    }
}
