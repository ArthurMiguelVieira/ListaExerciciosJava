package Exercicio13.test;

import Exercicio13.domain.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João",18,72);
        Pessoa pessoa2 = new Pessoa("Marcus",16,72);
        System.out.println(pessoa);
        System.out.println(pessoa2);
    }
}
