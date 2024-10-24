import javax.swing.*;
import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;
public class calculoTroco {
    public static void main (String[] args){
        float preco1;
        float troco;
        float pago;
        float resultado;

        NumberFormat formato = NumberFormat.getInstance(new Locale("pt", "BR" ));
        formato.setMinimumFractionDigits(2);
        Scanner entrada = new Scanner(System.in);
        System.out.println("valor da compra : ");
        preco1 = entrada.nextFloat();
        System.out.println("digiti o valor pago : ");
        pago = entrada.nextFloat();
        troco = pago-preco1;
        System.out.println("troco : " + troco);
    }
}
