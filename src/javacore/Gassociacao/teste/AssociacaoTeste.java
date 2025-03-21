package javacore.Gassociacao.teste;

import javacore.Gassociacao.dominio.Aluno;
import javacore.Gassociacao.dominio.Local;
import javacore.Gassociacao.dominio.Professor;
import javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Ruas das laranjeiras");
        Aluno aluno = new Aluno("Rafael Xavier", 38);
        Professor professor = new Professor("Paulo Fereira", "Algoritimo");
        Aluno[] alunosSeminario = {aluno};
        Seminario seminario = new Seminario("Dia D", alunosSeminario, local);
        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }

}
