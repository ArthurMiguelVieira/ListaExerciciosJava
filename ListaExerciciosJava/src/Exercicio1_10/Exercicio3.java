package Exercicio1_10;

public class Exercicio3 {
    //3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,
    //
    //caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
    //
    //imprimir seu valor na tela.
    public static void main(String[] args) {
        int A = 10;
        int B = 10;
        int C;
        if(A==B){
            C = A+B;
        }else{
            C=A*B;
        }
        System.out.println(C);
    }
}
