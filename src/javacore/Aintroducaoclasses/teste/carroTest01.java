package javacore.Aintroducaoclasses.teste;

import javacore.Aintroducaoclasses.dominio.Carro;

public class carroTest01 {
    public static void main(String[] args) {
        Carro ferrary = new Carro();

        ferrary.nome = "dragon";
        ferrary.modelo = "dutra";
        ferrary.ano = 2023;

        Carro fiat = new Carro();

        fiat.nome = "uno";
        fiat.modelo = "Miler";
        fiat.ano = 2014;

        System.out.println(ferrary.nome +"\n" + ferrary.modelo + "\n"+ ferrary.ano);
        System.out.println("-----------------------");
        System.out.println(fiat.nome +"\n"+ fiat.modelo +"\n"+ fiat.ano);

    }
}
