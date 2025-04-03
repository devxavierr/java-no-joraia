package javacore.Hheranca.Test;

import javacore.Hheranca.domain.Endereco;
import javacore.Hheranca.domain.Funcionario;
import javacore.Hheranca.domain.Pessoa;

public class herancaTeste01 {

    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setCep("2345435-454");
        endereco.setRua("orquideas");
        Pessoa pessoa = new Pessoa("Rafael Xavier");
        pessoa.setCpf("034834983940348");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        System.out.println("----------------");

        Funcionario funcionario = new Funcionario("Bobe");
        funcionario.setCpf("3245546456456");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        funcionario.imprime();
    }
}
