package javacore.Aintroducaoclasses.teste;

import javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Paulo";
        professor.sexo = 'M';
        professor.idade = 35;

        System.out.print(professor.nome + ", " + professor.sexo + ", " + professor.idade);

    }
}
