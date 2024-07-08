package Exercicio12.domain;

public enum TipoPagamento {
    DEBITO{
        @Override
        public double calcularPagamento(Cliente cliente,int numeroParcelas) {
            return cliente.getTotalPagamento() - (cliente.getTotalPagamento()*0.15);
        }
    },
    CREDITO{
        @Override
        public double calcularPagamento(Cliente cliente,int numeroParcelas) {
            return cliente.getTotalPagamento() - (cliente.getTotalPagamento()*0.1);
        }
    },
    PARCELADO(){
        @Override
        public double calcularPagamento(Cliente cliente,int numeroParcelas) {
            if(numeroParcelas <= 2){
                return cliente.getTotalPagamento();
            }else{
                return cliente.getTotalPagamento() + (cliente.getTotalPagamento()*0.1);
            }
        }
    };

    public abstract double calcularPagamento(Cliente cliente,int numeroParcelas);
}

