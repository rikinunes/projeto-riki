import java.util.Scanner;
public class exemplosOpRelacionais {
    public static void  main (String [] arg){
    int idadeMinima= 18;
    Scanner entrada = new Scanner(System.in);
    System.out.println("digite sua idade: ");
    int idade= entrada.nextInt();


    if (idade >= idadeMinima){
        System.out.println("voce e maior de idade!");
    } else {
        System.out.println("voce e menor de idade!");
    }
    System.out.println("Digite seu nome ");
    entrada.nextLine();
    String nome = entrada.nextLine();
    System.out.println("digite o nome do seu colega ");
    String nome2 = entrada.nextLine();
    if (nome .equalsIgnoreCase( nome2)){
        System.out.println(nome + " e " + nome2 + " tem nomes iguais ");
        } else {
        System.out.println(nome + " e " + nome2 + " tem nomes diferentes");}
        }

    }


