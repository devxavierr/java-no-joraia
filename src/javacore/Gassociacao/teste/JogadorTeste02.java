package javacore.Gassociacao.teste;

import javacore.Gassociacao.dominio.Jogador;
import javacore.Gassociacao.dominio.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {

        Jogador jogador = new Jogador("Pelé");
        Time time = new Time("Flamengo");

        jogador.setTime(time);
        jogador.imprime();


    }
}
