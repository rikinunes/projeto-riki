import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;
public class ConversaoTemperatura {
    public static void main (String[] args){
        float celsius;
        float resultado;

        Scanner entrada = new Scanner(System.in);
        System.out.println(" insira a temperatura em graus celcius para a conversão: ");
        celsius = entrada.nextFloat();

        resultado = (celsius * 9/5) + 32;
        System.out.println(celsius + " graus celsius equivalentes a " + resultado + " graus fahrenheit");






    }
}
