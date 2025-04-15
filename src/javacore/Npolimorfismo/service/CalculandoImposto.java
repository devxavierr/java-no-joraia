package javacore.Npolimorfismo.service;

import javacore.Npolimorfismo.dominio.Computador;
import javacore.Npolimorfismo.dominio.Tomate;

public class CalculandoImposto {

    public static void calcularImpostoComputador(Computador computador){
        System.out.println("Relatório de imposto do Computador");
        double imposto = computador.cancularImposto();
        System.out.println("Computador "+computador.getNome());
        System.out.println("Valor "+computador.getValor());
        System.out.println("Imposto a ser pago "+imposto);
    }

    public static void calcularImpostoTomate(Tomate tomate){
        System.out.println("Relatório de imposto do Computador");
        double imposto = tomate.cancularImposto();
        System.out.println("Tomate "+tomate.getNome());
        System.out.println("Valor "+tomate.getValor());
        System.out.println("Imposto a ser pago "+imposto);
    }

}
