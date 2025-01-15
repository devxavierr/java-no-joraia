package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {

        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Rafael";
        estudante1.idade = 37;
        estudante1.sexo = 'M';

        estudante2.nome = "Rafaela";
        estudante2.idade = 32;
        estudante2.sexo = 'F';

        estudante1.imprime();
        System.out.println("------------------------");
        estudante2.imprime();
    }
}
