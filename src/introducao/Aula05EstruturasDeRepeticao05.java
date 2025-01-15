package introducao;

public class Aula05EstruturasDeRepeticao05 {
    public static void main(String[] args){
        // while, do while, for

        // no while ele vai ser executado se a contição for verdadeira e no do while ele executa pelo menos uma vez.
        int count = 12;
        while(count < 10){
            System.out.println(++count);
        }
        do {
            System.out.println("dentro do do-while");
        } while (count < 10);


        for (int i=0; i<10;i++){
            System.out.println("For "+i);

        }
    }
}
