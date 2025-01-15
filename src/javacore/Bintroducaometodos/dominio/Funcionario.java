package javacore.Bintroducaometodos.dominio;

import java.text.DecimalFormat;

public class Funcionario {

    private String nome;
    private int idade;
    private double[] salario;
    private double media;

    public void imprimirDados(Funcionario funcionario) {
        System.out.println("Nome do funcionário = " + funcionario.nome);
        System.out.println("Idade do funcionário = " + funcionario.idade);
        if (salario == null){
            return;
        }
        for (double salarios : salario) {
            System.out.print(salarios + " ");
        }
        System.out.println("\n-------------------------------");
        imprimeMediaSalario();
    }

    public void imprimeMediaSalario() {
        if (salario == null){
            return;
        }
        for (double salarios : salario) {
            media += salarios;
        }
        media /= salario.length;
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("A quantidade de salário é: " + salario.length + " \nmédia: " + df.format(media));

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public double getMedia() {
        return media;
    }

}
