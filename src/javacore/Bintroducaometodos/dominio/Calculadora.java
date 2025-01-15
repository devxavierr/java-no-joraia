package javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeors() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeors() {
        System.out.println(21 - 2);
    }

    public void multiplicaDoiNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public double divideDoisNumeros2(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        } else {
            return num1 / num2;
        }

    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 10;
        num2 = 20;
        System.out.println("Num 1 = " + num1);
        System.out.println("Num 2 = " + num2);
    }

    public void somarArray(int[] numeros){
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}
