package Exercicio11.domain;

public class CalculadoraMedia {
    public static void calcularMediaAluno(Aluno aluno) {
        double somaNotas = 0;
        for (double nota : aluno.getNotas()) {
            somaNotas += nota;
        }
        double mediaNotas = somaNotas/aluno.getNotas().length;
        System.out.println("O aluno "+aluno.getNome()+" Teve a media de "+mediaNotas + " Portanto foi : ");
        if(mediaNotas < 7){
            System.out.println("Reprovado");
        }else{
            System.out.println("Aprovado");
        }
    }
}

