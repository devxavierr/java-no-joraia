package introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args){
        //Dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        //Considerando 1 como domingo

        byte diaDaSemana = 10;
        switch (diaDaSemana){
            case 1:
                System.out.println("Dom - final de semana");
                break;
            case 2:
                System.out.println("Seg - dia útil");
                break;
            case 3:
                System.out.println("Ter - dia útil");
                break;
            case 4:
                System.out.println("Qua - dia útil");
                break;
            case 5:
                System.out.println("Qui - dia útil");
                break;
            case 6:
                System.out.println("Sex - dia útil");
                break;
            case 7:
                System.out.println("Sab - final de semana");
                break;
            default:
                System.out.println("valor inválido");
                break;
        }
    }
}
