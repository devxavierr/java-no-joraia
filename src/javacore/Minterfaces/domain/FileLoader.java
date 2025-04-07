package javacore.Minterfaces.domain;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Carrega dados de um arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados de um arquivo");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando premissões no arquivo");
    }
}
