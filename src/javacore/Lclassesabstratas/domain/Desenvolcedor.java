package javacore.Lclassesabstratas.domain;

public class Desenvolcedor extends Funcionario{

    public Desenvolcedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaBonus() {
        this.salario = this.salario + this.salario * 0.05;
    }

    @Override
    public String toString() {
        return "Desenvolcedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
