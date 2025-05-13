package javacore.Npolimorfismo.Test01;

import javacore.Npolimorfismo.dominio.Computador;
import javacore.Npolimorfismo.dominio.Produto;
import javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto computador = new Computador("Dell Vostro", 2900);
        System.out.println("Computador Nome: " + computador.getNome());
        System.out.println("Computador Preço: " + computador.getValor());
        System.out.println(computador.cancularImposto());
        System.out.println("---------------------------");
        Produto tomate = new Tomate("perola", 7);
        System.out.println("Tomate Nome: " + tomate.getNome());
        System.out.println("Tomate Preço: " + tomate.getValor());
        System.out.println(tomate.cancularImposto());


    }
}
