package javacore.Npolimorfismo.Test01;

import javacore.Npolimorfismo.dominio.Computador;
import javacore.Npolimorfismo.dominio.Tomate;
import javacore.Npolimorfismo.service.CalculandoImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {

        Computador computador = new Computador("Mac M1 Pro", 7000);
        Tomate tomate = new Tomate("Cagador", 10);
        CalculandoImposto.calcularImpostoComputador(computador);
        System.out.println("---------------------------");
        CalculandoImposto.calcularImpostoTomate(tomate);

    }

}
