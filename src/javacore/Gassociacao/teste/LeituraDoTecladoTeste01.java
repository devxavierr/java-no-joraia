package javacore.Gassociacao.teste;

import java.awt.*;
import java.util.Scanner;

public class LeituraDoTecladoTeste01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu nome abaixo");
        String nome = input.nextLine();
        System.out.println("Digite a sua idade");
        int idade = input.nextInt();
        System.out.println("Digite M ou F para o seu sexo");
        char sexo = input.next().charAt(0);
        System.out.println("---------------------------");
        System.out.println("Seu nome é : " + nome);
        System.out.println("Sua idade é : " + idade);
        System.out.println("Seu sexo é : " + sexo);
    }
}
