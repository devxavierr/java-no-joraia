package javacore.Minterfaces.domain;

public interface DataLoader {
    void load();
    default void checkPermission(){
        System.out.println("Checando as permissões");
    }
}
