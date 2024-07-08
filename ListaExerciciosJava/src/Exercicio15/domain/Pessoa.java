
package Exercicio15.domain;

import java.time.LocalDate;

public class Pessoa {
    public String dataDeNascimento;

    public void calcularDataNascimento(Pessoa pessoa){
        LocalDate data = LocalDate.now();
        LocalDate dataNascimento = LocalDate.parse(pessoa.dataDeNascimento);
        System.out.println(data.until(dataNascimento));

    }

    public Pessoa(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
}
