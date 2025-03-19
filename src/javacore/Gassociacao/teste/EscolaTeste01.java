package javacore.Gassociacao.teste;

import javacore.Gassociacao.dominio.Escola;
import javacore.Gassociacao.dominio.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {

        Professor professor1 = new Professor("Rafael Xavier");
        Professor professor2 = new Professor("Luisa Xavier");
        Professor[] professors = {professor1, professor2};
        Escola escola = new Escola("School Xavier", professors);

        escola.imprime();
    }
}
