package javacore.Eblocosinicializacao.domain;

public class Anime {
    private String nome;
    private int[] episodios;

    // 1- Alocado espaço em memoria;
    // 2- cada atributo de classe é criado e inicializado default ou qualquer que for passado;
    // 3- Bloco de inicialização e executado;
    // 4- Construtor é executado;

    {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio: this.episodios){
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
