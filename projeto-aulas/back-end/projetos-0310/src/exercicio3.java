import java.util.Scanner;
public class exercicio3 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome = "joao";
        System.out.println("qual seu nome ?");
        String Nome = entrada.nextLine();
        if (Nome.equalsIgnoreCase("joão")) {
            System.out.println("aluno = aluno !");
        } else if (!Nome.equalsIgnoreCase("joão")) {
            System.out.println("aluno diferente de aluno  !");
        }
    }
}
