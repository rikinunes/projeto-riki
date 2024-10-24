import java.util.Scanner;
public class BemVindo {
    public static void main (String[] args){
         Scanner entradaDados =new Scanner(System.in);
         System.out.println("insira seu nome: ");
 String nome = entradaDados.nextLine();
 System.out.println("Olá " + nome + " ! seja benvindo(a)");
        System.out.println("Olá " + nome + " !");
        System.out.print("seja benvindo(a)");

        entradaDados.close();
    }
}
