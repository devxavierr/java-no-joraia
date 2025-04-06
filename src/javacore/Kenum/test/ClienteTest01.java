package javacore.Kenum.test;

import javacore.Kenum.domain.Cliente;
import javacore.Kenum.domain.TipoCliente;
import javacore.Kenum.domain.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Thales", TipoCliente.PJ, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Bruna", TipoCliente.CPF, TipoPagamento.DEBITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
    }
}
