package javacore.Aintroducaoclasses.teste;

import javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Rafael";
        estudante.idade = 23;
        estudante.sexo = 'M';

        System.out.println( estudante.nome);
        System.out.println( estudante.idade);
        System.out.println( estudante.sexo);
    }

}
