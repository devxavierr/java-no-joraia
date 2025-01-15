package introducao;

import javax.swing.*;

public class Aula05EstruturasDeRepeticao06 {
    public static void main(String[] args) {
        //imprima todos os numeros pares de 0 até 1000000
        int i = 0;
        for (i = 0; i < 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println("Numeros pares de ZERO até 1 MILHÃO " + i);
            }

        }
    }

}
