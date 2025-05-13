package javacore.Npolimorfismo.Test01;

import javacore.Npolimorfismo.dominio.Computador;
import javacore.Npolimorfismo.dominio.Produto;
import javacore.Npolimorfismo.dominio.Tomate;
import javacore.Npolimorfismo.service.CalculandoImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Dell Vostro", 2900);

        System.out.println("---------------------------");
        Tomate tomate = new Tomate("perola", 7);
        tomate.setDataValidade("2025-05-20");

        CalculandoImposto.calcularImposto(tomate);
        System.out.println("-----------------------------");
        CalculandoImposto.calcularImposto(produto);


    }
}
