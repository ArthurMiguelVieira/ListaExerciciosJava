package Exercicio23;
//21 - Faça um algoritmo que efetue o cálculo do salário líquido de um professor.
// As informações fornecidas serão: valor da hora aula, número de aulas lecionadas no mês e percentual de desconto do INSS. Imprima na tela o salário líquido final.
public class Exercicio23 {
    public static void main(String[] args) {
        double valorHoraAula = 15;
        double mediaHorasAulasPorDia = 5;
        int numeroAulasLecionadas = 30;
        double descontoINSS = 0.1;
        double calculoSalario = numeroAulasLecionadas*(mediaHorasAulasPorDia*valorHoraAula);
        System.out.println("Salario bruto "+ calculoSalario);
        System.out.println("Salario liquido "+ (calculoSalario -(calculoSalario*descontoINSS)));
    }
}
