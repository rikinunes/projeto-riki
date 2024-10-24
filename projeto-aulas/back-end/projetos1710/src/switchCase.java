import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\nBem vindo ao Menu de Opções");
        System.out.println("Escolha uma opção");
        System.out.println("1 - Somar dois números");
        System.out.println("2 - Subtrair dois número");
        System.out.println("3 - Multiplicar dois números");
        System.out.println("4 - Dividir dois números");
        System.out.println("0 - Sair");
        System.out.println("Digite sua opção: ");
        int opcao = entrada.nextInt();
        if (opcao != 0 && (opcao <= 4)) {
            if (entrada.hasNextInt()) {
                System.out.println("Digite o primeiro número: ");
                int num1 = entrada.nextInt();
                if (entrada.hasNextInt()) {
                    System.out.println("Digite o segundo número: ");
                    int num2 = entrada.nextInt();
                    int resultado1 = num1 + num2;

                    switch (opcao) {
                        case 1:

                            System.out.println("A soma é: " + resultado1);
                            break;

                        case 2:
                            System.out.println("Digite o primeiro número: ");
                            int num3 = entrada.nextInt();
                            System.out.println("Digite o segundo número: ");
                            int num4 = entrada.nextInt();
                            int resultado2 = num3 - num4;
                            System.out.println("A subtração é: " + resultado2);
                            break;

                        case 3:
                            System.out.println("Digite o primeiro número: ");
                            int num5 = entrada.nextInt();
                            System.out.println("Digite o segundo número: ");
                            int num6 = entrada.nextInt();
                            int resultado3 = num5 * num6;
                            System.out.println("A multiplicação é: " + resultado3);
                            break;

                        case 4:
                            System.out.println("Digite o primeiro número: ");
                            int num7 = entrada.nextInt();
                            System.out.println("Digite o segundo número: ");
                            int num8 = entrada.nextInt();
                            if (num8 != 0) {
                                double resultado4 = (double) num7 / num8;
                                System.out.println("A divisão é: " + resultado4);
                            } else System.out.println("não e possivel dividir numeros por zero");
                            break;


                        default:
                            System.out.println(" opção invalida, digite um numero entre 0 e 4!");
                    }
                }else  System.out.println("só é possivel usar numeros inteiros !");

            }else System.out.println("só é possivel usar numeros inteiros !");
        } else System.out.println(" o programa sera incerrado !");
        entrada.close();
    }
}