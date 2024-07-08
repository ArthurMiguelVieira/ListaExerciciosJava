package Exercicio1_10;

public class Exercicio8 {
    //8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.
    public static void main(String[] args) {
        int x1 = 13;
        int x2 = 32;
        int x3 = 33;

        if(x1 > x2 &&x1 > x3){
            System.out.println(x1);
            if(x2>x3){
                System.out.println(x2);
                System.out.println(x3);
            }else{
                System.out.println(x3);
                System.out.println(x2);
            }
        }
        if(x2 > x1 &&x2 > x3){
            System.out.println(x2);
            if(x1>x3){
                System.out.println(x1);
                System.out.println(x3);
            }else{
                System.out.println(x3);
                System.out.println(x1);
            }
        }
        if(x3 > x2 &&x3 > x1){
            System.out.println(x3);
            if(x2>x1){
                System.out.println(x2);
                System.out.println(x1);
            }else{
                System.out.println(x1);
                System.out.println(x2);
            }
        }

    }
}
