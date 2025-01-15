package introducao;

public class Aula05EstruturasDeRepeticao08 {
    public static void main(String[] args){
        //Dado o valor de um carro, descubra em quantas ele pode ser parcelado
        //Condição valorParcela >= 100

        double valorTotal = 30000;

        for (int parcela = 1; parcela <= valorTotal; parcela++){
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000){
                break;
            }
            System.out.println("Parcela "+ parcela+ " R$ " + valorParcela);
        }

    }
}
