package Exercicio12.test;

import Exercicio12.domain.Cliente;
import Exercicio12.domain.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1000,TipoPagamento.CREDITO);
        System.out.println(cliente);
        System.out.println(TipoPagamento.PARCELADO.calcularPagamento(cliente,2));
    }
}
