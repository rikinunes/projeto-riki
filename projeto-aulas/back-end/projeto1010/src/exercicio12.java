import java.util.Scanner;
import java.util.Random;
public class exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random gerador = new Random();
        //0=pedra, 1=papel, 2=tesoura
        int escolhaDoComputador = gerador.nextInt(2);
        System.out.println("sua escolha (pedra,papel e tesoura):");
        String escolhaDoUsuario = entrada.nextLine();
        String resultado = "";
        String escolhaMaquina = "";

        if (escolhaDoUsuario.equalsIgnoreCase("pedra")) {
            if (escolhaDoComputador == 0) {
                resultado = "empate";
                escolhaMaquina = "pedra";
            } else if (escolhaDoComputador == 1) {
                resultado = "computador venceu";
                escolhaMaquina = "papel";
            } else if (escolhaDoComputador == 2) {
                resultado = "usuario venceu";
                escolhaMaquina = "Tesoura";
            }
        } else if (escolhaDoUsuario.equalsIgnoreCase("papel")) {
            if (escolhaDoComputador == 0) {
                resultado = "vitoria do usuario";
                escolhaMaquina = "pedra";
            } else if (escolhaDoComputador == 1) {
                resultado = "empate";
                escolhaMaquina = "papel";
            } else if (escolhaDoComputador == 2) {
                resultado = "vitoria da maquina";
                escolhaMaquina = "Tesoura";
            }
        } else if (escolhaDoUsuario.equalsIgnoreCase("tesoura")) {
            if (escolhaDoComputador == 0) {
                resultado = "vitoria da maquina";
                escolhaMaquina = "pedra";
            } else if (escolhaDoComputador == 1) {
                resultado = "vitoria do usuario";
                escolhaMaquina = "papel";
            } else if (escolhaDoComputador == 2) {
                resultado = "empate ";
                escolhaMaquina = "Tesoura";
            }
            System.out.println("escolha do computador :" + escolhaMaquina);
        } else {
            resultado = "escolha invalida, escolha entre pedra papel e tesoura !";
        }
        System.out.println(resultado);
    }
}


