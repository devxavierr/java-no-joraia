package javacore.Npolimorfismo.dominio;

public class Tomate extends Produto{

    public static final double IMPOSTO_PORCENTO = 0.06;

    private String dataValidade;
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double cancularImposto() {
        return this.getValor() * IMPOSTO_PORCENTO;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
