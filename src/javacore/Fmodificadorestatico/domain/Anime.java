package javacore.Fmodificadorestatico.domain;

public class Anime {
    private String nome;
    private static int[] episodios;

    // 0- Bloco de inicialização é executado quando a JVM carregar classe
    // 1- Alocado espaço em memoria;
    // 2- cada atributo de classe é criado e inicializado default ou qualquer que for passado;
    // 3- Bloco de inicialização e executado;
    // 4- Construtor é executado;

    static {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio: Anime.episodios){
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
