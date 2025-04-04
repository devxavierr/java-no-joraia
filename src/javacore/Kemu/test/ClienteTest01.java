package javacore.Kemu.test;

import javacore.Kemu.domain.Cliente;
import javacore.Kemu.domain.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Thales", TipoCliente.PJ);
        Cliente cliente2 = new Cliente("Bruna", TipoCliente.CPF);
        Cliente cliente3 = new Cliente("Bruna", TipoCliente.PJ);
        Cliente cliente4 = new Cliente("Thales", TipoCliente.CPF);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
    }
}
