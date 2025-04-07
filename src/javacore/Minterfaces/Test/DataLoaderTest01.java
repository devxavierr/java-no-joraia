package javacore.Minterfaces.Test;

import javacore.Minterfaces.domain.DatabaseLoader;
import javacore.Minterfaces.domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();

        System.out.println("----------------------");

        databaseLoader.checkPermission();
        databaseLoader.remove();
        fileLoader.checkPermission();
        fileLoader.remove();
    }
}
