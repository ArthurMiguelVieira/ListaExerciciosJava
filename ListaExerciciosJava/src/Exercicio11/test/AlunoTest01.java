package Exercicio11.test;

import Exercicio11.domain.Aluno;
import Exercicio11.domain.CalculadoraMedia;

//11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno e
//
// se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.
public class AlunoTest01 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João", new double[]{10, 5, 10, 9});
        CalculadoraMedia.calcularMediaAluno(aluno1);
    }
}
