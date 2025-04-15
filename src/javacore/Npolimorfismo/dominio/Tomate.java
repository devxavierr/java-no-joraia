package javacore.Npolimorfismo.dominio;

public class Tomate extends Produto{

    public static final double IMPOSTO_PORCENTO = 0.06;
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double cancularImposto() {
        return this.getValor() * IMPOSTO_PORCENTO;
    }
}
