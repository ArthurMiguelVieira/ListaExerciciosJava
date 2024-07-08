package Exercicio19;
//19 - Faça um algoritmo que imprima na tela a tabuada de 1 até 10.
public class Exercicio19 {
    public static void main(String[] args) {
        int[] tabulada = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < tabulada.length; i++) {
            for (int j = 0; j < tabulada.length; j++) {
                System.out.print(tabulada[i]+"x"+ tabulada[j]+": "+(tabulada[i]*tabulada[j])+"|");


            }
            System.out.println();
        }
    }

}
