package Exercicio16;
//16 - Faça um algoritmo que leia três valores que representam os três lados de um triângulo e verifique se são válidos, determine se o triângulo é
//
//equilátero, isósceles ou escaleno.
public class Exercicio16 {
    public static void main(String[] args) {
        double lado1 = 23;
        double lado2 = 21;
        double lado3 = 22;

        if(lado1 == lado2 && lado2 == lado3){
            System.out.println("Triangulo equilátero");
        }else if(lado1 == lado2 ||  lado2 == lado3 || lado3 == lado1){
            System.out.println("Triangulo isósceles");
        }else{
            System.out.println("Triangulo escaleno");
        }
    }
}
