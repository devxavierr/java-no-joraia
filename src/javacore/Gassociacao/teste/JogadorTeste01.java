package javacore.Gassociacao.teste;

import javacore.Gassociacao.dominio.Jogador;

public class JogadorTeste01 {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Romario");
        Jogador jogador2 = new Jogador("Bebeto");
        Jogador jogador3 = new Jogador("Ronaldo");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }


    }
}
