import java.util.Scanner;
public class exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();
        System.out.print("Digite a frequência do aluno (em %): ");
        double frequencia = scanner.nextDouble();
        if (frequencia < 75) {
            System.out.println("Aluno Reprovado: Frequência menor que 75%");
        } else if (nota >= 7 && frequencia >= 75) {
            System.out.println("Aluno Aprovado");
        } else if (nota >= 6 && nota < 7 && frequencia >= 75) {
            System.out.println("Aluno em Recuperação");
        } else if (nota < 6 || frequencia < 75) {
            System.out.println("Curso de Nivelamento");
        }
    }
}
