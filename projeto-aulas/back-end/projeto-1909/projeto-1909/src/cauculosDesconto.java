import javax.swing.*;
import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;
public class cauculosDesconto {
    public static void main (String[] args){
  float preco1;
  float porcentagemDesconto;
  float desconto;
  float resultado;

        NumberFormat formato = NumberFormat.getInstance(new Locale("pt", "BR" ));
        formato.setMinimumFractionDigits(2);
        Scanner entrada = new Scanner(System.in);
        System.out.println("preco original do produto: ");
        preco1 = entrada.nextInt();
        System.out.println("porcentagem do desconto : ");
        porcentagemDesconto= entrada.nextInt();
        desconto = preco1*(porcentagemDesconto / 100);
        System.out.println("valor do desconto : " + formato.format(desconto));
        resultado = preco1-desconto;
        System.out.println("preco final é : " + formato.format(resultado));












    }
}
