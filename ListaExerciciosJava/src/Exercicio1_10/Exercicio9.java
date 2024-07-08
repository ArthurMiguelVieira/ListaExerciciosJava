package Exercicio1_10;

public class Exercicio9 {
    //9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua altura e imprima na tela sua condição
    //
    //de acordo com a tabela abaixo:
    //
    //Fórmula do IMC = peso / (altura) ²
    //
    //Tabela Condições IMC
    // Abaixo de 18,5   | Abaixo do peso
    // Entre 18,6 e 24,9 | Peso ideal (parabéns)
    // Entre 25,0 e 29,9 | Levemente acima do peso
    // Entre 30,0 e 34,9 | Obesidade grau I
    // Entre 35,0 e 39,9 | Obesidade grau II (severa)
    // Maior ou igual a 40 | Obesidade grau III (mórbida)
    public static void main(String[] args) {
        double peso = 120;
        double altura=1.80;
        double IMC = (peso/(altura*altura));

        if(IMC <= 18.5){
            System.out.println(IMC+" Abaixo do peso");
        }else if(IMC > 18.5 && IMC <=24.9 ){
            System.out.println(IMC+" peso ideal");
        }else if (IMC > 25 && IMC <=29.9){
            System.out.println(IMC+" Levemente acima do peso");
        }else if (IMC > 30 && IMC <=34.9){
            System.out.println(IMC+" Obesidade grau I ");
        }else if(IMC > 35 && IMC <=39.9){
            System.out.println(IMC+" Obesidade grau II ");
        }else if( IMC >= 40){
            System.out.println(IMC+" Obesidade grau III ");
        }
    }
}
