import java.util.Scanner;
public class exercicio2 {
      public static void main (String[] args){
          Scanner entrada = new Scanner(System.in);
          int nota = 6;
          System.out.println( "qual a sua nota ?" );
          int Nota = entrada.nextInt();
          if (Nota >= 6) {
              System.out.println("vc foi aprovado !");
          } else System.out.println("vc foi reprovado !");
      }
}
