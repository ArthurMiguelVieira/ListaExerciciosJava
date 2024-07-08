package Exercicio1_10;

public class Exercicio10 {
    // 10 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.
    public static void main(String[] args) {
        double[] notas = {10,3.5,4.5};
        double somaNotas = 0;
        for (double nota : notas){
            somaNotas += nota;
        }
        double mediaNotas = somaNotas / notas.length;
        System.out.println(mediaNotas);
    }
}
