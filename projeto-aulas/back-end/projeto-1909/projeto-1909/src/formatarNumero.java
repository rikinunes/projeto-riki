import java.util.Locale;
import java.text.NumberFormat;
public class formatarNumero {
    public static void main (String[] args){
        long numero = 1234567890;
        double numeroDecimal = 12345.67891;
        double porcentagem = 0.15;


        NumberFormat formato = NumberFormat.getInstance(Locale.US);
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance();
        NumberFormat formatoPorcento = NumberFormat.getPercentInstance();

        formato.setMaximumFractionDigits(5);
        //formato.setMaximumIntegerDigits(7);
        System.out.println("numero formatado conforme configuracao do sistema operacional: "
                + formato.format(numero));
        System.out.println("numero formatado com milhar e casas decimais "
                + formato.format(numeroDecimal));
        System.out.println("formatando moeda " + formato.format(numeroDecimal));
        System.out.println("formatando porcentagem" + formato.format(porcentagem));


    }


}
