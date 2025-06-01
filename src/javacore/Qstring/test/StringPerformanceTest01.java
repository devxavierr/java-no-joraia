package javacore.Qstring.test;

public class StringPerformanceTest01 {
    public static void main(String[] args) {

        long inicio = System.currentTimeMillis();
        concatString(100_000);
        long fim = System.currentTimeMillis();
        System.out.println("Temopo usando String "+ (fim - inicio) +"ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(100_000);
        fim = System.currentTimeMillis();
        System.out.println("Temopo usando StringBuffer "+ (fim - inicio) +"ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(100_000);
        fim = System.currentTimeMillis();
        System.out.println("Temopo usando StringBuilder "+ (fim - inicio) +"ms");
    }

    private static  void concatString(int tamanho){
        String texto = "";

        for (int i = 0; i < tamanho; i++){
            texto +=i;
        }
    }

    private static void concatStringBuilder(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++){
            sb.append(1);
        }
    }

    private static void concatStringBuffer(int tamanho){
        StringBuffer sb = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++){
            sb.append(1);
        }
    }
}
