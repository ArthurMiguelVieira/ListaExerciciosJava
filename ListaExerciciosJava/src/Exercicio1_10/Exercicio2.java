package Exercicio1_10;

public class Exercicio2 {
    //2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
    public static void main(String[] args) {
        int x = 4;
        if(x%2==0){
            System.out.println(x+" é par");
        }else{
            System.out.println(x+" é ímpar");
        }

        if(x > 0){
            System.out.println(x+" é positivo");
        }else{
            System.out.println(x+" é negativo");
        }
    }
}
