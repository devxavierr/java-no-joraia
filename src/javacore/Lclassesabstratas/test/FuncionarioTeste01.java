package javacore.Lclassesabstratas.test;

import javacore.Lclassesabstratas.domain.Desenvolcedor;
import javacore.Lclassesabstratas.domain.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Rafaela", 5000);
        Desenvolcedor desenvolvedor = new Desenvolcedor("Rafael", 12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
