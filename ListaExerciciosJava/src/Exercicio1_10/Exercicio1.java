package Exercicio1_10;

public class Exercicio1 {
    //1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.
    public static void main(String[] args) {
        int A = 20;
        int B = 5;
        int C = 10;

        if((A+B)<C){
            System.out.println("A+B: "+(A+B)+" é menor do que C:"+C);
        }else if ((A+B)>C){
            System.out.println("A+B: "+(A+B)+" é Maior do que C:"+C);
        }else{
            System.out.println("A+B: "+(A+B)+" é igual á C:"+C);
        }
    }
}
