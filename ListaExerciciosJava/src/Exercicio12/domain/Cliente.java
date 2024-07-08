package Exercicio12.domain;

public class Cliente {
    private double totalPagamento;
    TipoPagamento tipoPagamento;

    public Cliente(double totalPagamento, TipoPagamento tipoPagamento) {
        this.totalPagamento = totalPagamento;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "totalPagamento=" + totalPagamento +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }

    public double getTotalPagamento() {
        return totalPagamento;
    }

    public void setTotalPagamento(double totalPagamento) {
        this.totalPagamento = totalPagamento;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
}
