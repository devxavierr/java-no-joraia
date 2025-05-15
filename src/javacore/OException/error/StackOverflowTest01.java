package javacore.OException.error.Teste;

public class StackOverflowTest01 {
    public static void main(String[] args) {
        recurssividade();
    }

    public static void recurssividade(){
        recurssividade();
    }
}
