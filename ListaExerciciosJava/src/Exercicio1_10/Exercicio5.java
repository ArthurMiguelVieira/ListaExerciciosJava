package Exercicio1_10;

public class Exercicio5 {
    //5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse
    //
    //usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).
    public static void main(String[] args) {
        double salarioMinimo = 1293.20;
        double salarioFuncionario = 2600;
        double quantidadeSalariosMinimos = salarioFuncionario/salarioMinimo;
        System.out.println("Funcionario ganha "+quantidadeSalariosMinimos+" salarios minimos");
    }
}
