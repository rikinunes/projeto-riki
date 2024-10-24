import java.util.Locale;

public class Riki {
    public static void main(String[] args) {
        String produto1 = "computador";
        String produto2 = "mesa de escritório";
        int idade = 30;
        int codigo = 5290;
        char genero = 'F';
        double preco1 = 21000.0;
        double preco2 = 650.50;
        double medida = 53.234567;

        Locale.setDefault(Locale.US);
        System.out.println("Produtos:");
        System.out.printf("%s, cujo o preço é R$ %.2f%n", produto1, preco1);
        System.out.printf("%s, cujo o preço é R$ %.2f%n", produto2, preco2);
        System.out.printf("registro %d anos, codigo %d e genero: %c%n", idade, codigo, genero);
        System.out.printf("medida com 8 casas decimais: %.8f%n", medida);
        System.out.printf("roteado (com tres casas decimais): %.3f%n", medida);
        Locale.setDefault(Locale.US);
        System.out.printf("Ponto decimal dos EUA: %.3f", medida);
    

    }
}
