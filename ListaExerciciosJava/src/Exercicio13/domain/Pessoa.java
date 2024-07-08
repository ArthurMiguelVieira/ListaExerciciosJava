package Exercicio13.domain;

public class Pessoa {
    public String nome;
    public int idade;
    public double peso;

    public Pessoa(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    @Override
    public String toString() {
        if(this.idade >= 18){
            return "Pessoa{" +
                    "nome='" + nome + '\'' +
                    ", idade=" + idade +
                    ", peso=" + peso +
                    ",  é Maior de idade"+
                    '}';

        }else {
            return "Pessoa{" +
                    "nome='" + nome + '\'' +
                    ", idade=" + idade +
                    ", peso=" + peso +
                    ",  é Menor de idade"+
                    '}';

        }
    }
}
