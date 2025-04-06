package javacore.Kenum.domain;

public enum TipoCliente {
    CPF(1),
    PJ(2);

    public final int VALOR;

    TipoCliente(int VALOR) {
        this.VALOR = VALOR;
    }
}
