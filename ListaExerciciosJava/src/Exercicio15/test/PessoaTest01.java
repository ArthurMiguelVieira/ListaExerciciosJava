package Exercicio15.test;

import Exercicio15.domain.Pessoa;

import java.time.LocalDate;


public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("2003-08-07");
        pessoa.calcularDataNascimento(pessoa);
    }
}
