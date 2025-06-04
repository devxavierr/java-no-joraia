package javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {

        String nome = "Rafael Xavier";
        nome.concat(" Paulo");
        nome.substring(0,3);
        System.out.println(nome);

        StringBuilder sb = new StringBuilder();
        sb.append(" Rafael Xavier").append(" Dev");
        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);
    }
}
