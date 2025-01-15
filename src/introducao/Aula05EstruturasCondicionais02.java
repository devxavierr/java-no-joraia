package introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args){
        // Doar se salario > 5000
        double salario = 6000;
        String mensagemDoar = "Eu vou doar";
        String mensagemNaoDoar = "Eu não vou doar";
        String resultado;

        if (salario > 5000){
            resultado = mensagemDoar;
        }else {
            resultado = mensagemNaoDoar;
        }
        //Operado ternario
        String resultado1 = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
        System.out.println(resultado1);
    }
}
