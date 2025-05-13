package javacore.Npolimorfismo.dominio;

public class Televisao extends Produto{
    public static final double IMPOSTO_PORCENTO = 0.20;
    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double cancularImposto() {
        return this.getValor() * IMPOSTO_PORCENTO;
    }
}
