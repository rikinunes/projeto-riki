import java.util.Scanner;
public class aluno {
    public static void  main (String [] arg){

        Scanner entrada = new Scanner(System.in);

        int idadeMinima = 18;
        String estudante;

        System.out.println("digite sua idade: ");
        int idade = entrada.nextInt();
        System.out.println("você é estudante ?" );
        entrada.nextLine();
       if ( idadeMinima <= 18){
           System.out.println("O desconto ja não se aplica a você");
       }


    }
}
