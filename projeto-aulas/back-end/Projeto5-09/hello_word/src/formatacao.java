

import java.util.Locale;

public class formatacao {
    public static void main (String[] args){
        String nome = "Riki";
                int idade = 35;
                double salario = 45879.9;
                System.out.println(nome + " tem " + idade + " anos e" + "ganha R$" + salario);
                System.out.printf("%s tem %d anos e ganha R$ %.2f%n ", nome, idade, salario);
        Locale.setDefault(Locale.US);
        System.out.printf("%s tem %d anos e ganha R$ %.2f", nome, idade, salario);
        Locale.setDefault(new Locale("pt", "BR"));
        System.out.printf("%s tem %d anos e ganha R$ %.2f", nome, idade, salario);
    }
}
