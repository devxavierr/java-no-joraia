package javacore.Npolimorfismo.service;

import javacore.Npolimorfismo.dominio.Produto;
import javacore.Npolimorfismo.dominio.Tomate;

public class CalculandoImposto {

    public static void calcularImposto(Produto produto){
        System.out.println("Relatorio de imposto");
        double imposto = produto.cancularImposto();
        System.out.println("Produto "+ produto.getNome());
        System.out.println("Preço "+ produto.getValor());
        System.out.println("Imposto "+ imposto);
        if (produto instanceof Tomate){
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());
        }

    }

}
