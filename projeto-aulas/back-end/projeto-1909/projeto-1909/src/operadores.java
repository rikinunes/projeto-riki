import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
public class operadores {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        float resultado;
        NumberFormat formato = NumberFormat.getInstance();
        Scanner entrada = new Scanner(System.in);
        formato.setMinimumFractionDigits(1);


        System.out.println("digite um numero: ");
        numero1 = entrada.nextInt();
        System.out.println("digite outro numero: ");
        numero2 = entrada.nextInt();

        //adicao
        resultado = numero1 + numero2;
        System.out.println("soma de " + numero1 + " mais " + numero2 + " é igual a " + formato.format(resultado));

        // subitracao
        resultado = numero1 - numero2;
        System.out.println(" a subitracao de " + numero1 + " mais " + numero2 + " é igual a " + formato.format(resultado));

        // multiplicacao
        resultado = numero1 * numero2;
        System.out.println(" a multiplicação de " + numero1 + " mais " + numero2 + " é igual a " + formato.format(resultado));

        // divisao
        resultado = numero1 / numero2;
        System.out.println(" a divisao de " + numero1 + " mais " + numero2 + " é igual a " + formato.format(resultado));


        // o resto da divisao
        resultado = numero1 % numero2;
        System.out.println(" a divisao de" + numero1 + " mais " + numero2 + " é igual a " + formato.format(resultado));


        entrada.close();
    }
}
