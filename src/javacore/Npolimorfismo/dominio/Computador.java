package javacore.Npolimorfismo.dominio;

public class Computador extends Produto{

    public static final double IMPOSTO_PORCENTO = 0.21;
    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double cancularImposto() {
        System.out.println("Calculando imposto do Computador");
        return this.getValor() * IMPOSTO_PORCENTO;
    }
}
