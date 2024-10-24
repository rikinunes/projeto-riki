import javax.swing.*;
import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;
public class Imposto {
    public static void main (String[] args){
        float preco1;
        float porcentagem;
        float desconto;
        float precoDesconto;
        float icms1;
        float icms2;
        float aliguota = 17;

        NumberFormat formato = NumberFormat.getInstance(new Locale("pt", "BR"));

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o preço original do produto ");
        preco1 = entrada.nextFloat();
        System.out.println("Digite a porcentagem com desconto ");
        porcentagem = entrada.nextFloat();
        System.out.println("Preço original R$ " + formato.format(preco1));
        desconto = preco1 * (porcentagem/100);
        System.out.println("Desconto R$ " + formato.format(desconto));
        precoDesconto = preco1 - desconto;
        System.out.println("Preço com Desconto R$ " + formato.format(precoDesconto));
        icms1 = precoDesconto * (aliguota/100);
        System.out.println("ICMS  " + formato.format(icms1));
        icms2 = precoDesconto + icms1;
        System.out.println("Preço final " + formato.format(icms2));

    }
}
