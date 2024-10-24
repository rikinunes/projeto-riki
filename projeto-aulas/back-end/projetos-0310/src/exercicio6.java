import java.util.Scanner;
public class exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String estadocivi= "casado";
        String EstadoCivi = "viuvo";
        String ESTADOCIVI = "Solteiro";
        System.out.println("qual seu estado civil ?");
        String Nome = entrada.nextLine();
        if (Nome.equalsIgnoreCase("casado") || Nome.equalsIgnoreCase("casada")) {
            System.out.println("vc e  " + Nome);
        } else if (Nome.equalsIgnoreCase( "viuvo") || Nome.equalsIgnoreCase("viuva")) {
            System.out.println("vc e " + Nome);
        } else if ( Nome.equalsIgnoreCase("solteiro") || Nome.equalsIgnoreCase("solteira")){
            System.out.println("vc é " + Nome);
        } else {
        System.out.println("estado civil invalido");
           }
       }
    }


