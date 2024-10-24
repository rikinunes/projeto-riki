import java.util.Scanner;
public class exercicio1 {
     public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int idade = 18;
        System.out.println( "qual a sua idade ?" );
        int Idade = entrada.nextInt();
        if (Idade >= 18) {
            System.out.println("vc e maior de idade !");
        } else System.out.println("vc e menor de idade !");
    }
}
