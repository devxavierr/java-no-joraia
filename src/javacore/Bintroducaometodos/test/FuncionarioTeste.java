package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Paulo Henrique");
        funcionario.setIdade(23);
        funcionario.setSalario(new double[]{2000, 3000, 5000});


        funcionario.imprimirDados(funcionario);
//        funcionario.imprimeMediaSalario();
    }
}
