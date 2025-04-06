package javacore.Kenum.domain;

public enum TipoPagamento {
    DEBITO(1){
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    },
    CREDITO(2){
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };

    public abstract double calcularDesconto(double valor);

    public final int VALOR;

    TipoPagamento(int VALOR) {
        this.VALOR = VALOR;
    }
}
