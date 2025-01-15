package introducao;

public class Aula05EstruturasDadosArray11 {
    public static void main(String[] args){
       String [] nomes = {"Rafael", "Henrique", "Xavier"};
       String [] nomes1 = new String[]{"Rafael", "Henrique", "Xavier"};
       String [] nomes2 = {"Rafael", "Henrique", "Xavier"};

        for(int i = 0; i < nomes.length; i ++){
            System.out.println(nomes1[i]);
        }

        for(String n : nomes2){
            System.out.println(n);
        }

    }
}
