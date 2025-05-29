package javacore.OException.exception.test;

import javacore.OException.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);
        String usuario = "Rafael";
        String senha = "Xavier";
        System.out.println("Digite o Usuário: ");
        String usernameDigitado = teclado.nextLine();
        System.out.println("Digite a Senha : ");
        String senhaDigitada = teclado.nextLine();

        if (!usernameDigitado.equals(usuario) || !senhaDigitada.equals(senha)) {
            throw new LoginInvalidoException("Senha invalida");
        }
        System.out.println("Usuário logado com SUCESSO!");

    }
}
