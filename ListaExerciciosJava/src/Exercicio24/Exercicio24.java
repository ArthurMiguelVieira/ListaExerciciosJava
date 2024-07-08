package Exercicio24;
//22 - Faça um algoritmo que calcule a quantidade de litros de combustível gastos em uma viagem, sabendo que o carro faz 12km com um litro.
// Deve-se fornecer ao usuário o tempo que será gasto na viagem a sua velocidade média, distância percorrida e a quantidade de litros utilizados para fazer a viagem.
//Fórmula: distância = tempo x velocidade.
//litros usados = distância / 12.
public class Exercicio24 {
    public static void main(String[] args) {
        double distancia = 300;
        double velocidade = 80;
        System.out.println("Distancia:" + distancia +" KM");
        System.out.println("Tempo de viagem : "+ distancia/velocidade + " horas");
        System.out.println("Gasto combustivel : "+ distancia/12 + " litros ");

    }
}
