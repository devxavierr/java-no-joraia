package introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args){
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida){
            System.out.println("Autorizado");
        }else {
            System.out.println("Não Autorizado");
        }
    }
}
