    import java.util.Scanner;
    public class Marcela {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            Scanner entradaOpcao = new Scanner(System.in);

            System.out.println("\nBem-vindo ao Menu de Opções!");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Somar dois números");
            System.out.println("2 - Subtrair dois números");
            System.out.println("3 - Multiplicar dois números");
            System.out.println("4 - Dividir dois números");
            System.out.println("0 - Sair");
            System.out.print("Digite sua opção: ");
            int opcao = entradaOpcao.nextInt();

            while (opcao != 0) {
                if (opcao <= 4) {
                    System.out.print("Digite o primeiro número: ");
                    if (entrada.hasNextInt()) {
                        int num1 = entrada.nextInt();
                        System.out.print("Digite o segundo número: ");
                        if (entrada.hasNextInt()) {
                            int num2 = entrada.nextInt();
                            switch (opcao) {
                                case 1:
                                    int resultado = num1 + num2;
                                    System.out.println("A soma é: " + resultado);
                                    break;
                                case 2:
                                    resultado = num1 - num2;
                                    System.out.println("A subtração é: " + resultado);
                                    break;
                                case 3:
                                    resultado = num1 * num2;
                                    System.out.println("A multiplicação é: " + resultado);
                                    break;
                                case 4:
                                    if (num2 != 0) {
                                        double resultadoDivisao = (double) num1 / num2;
                                        System.out.println("A divisão é: " + resultadoDivisao);
                                    } else System.out.println("Não é possível dividir números por zero");
                                    break;
                                default:
                                    System.out.print("Opção inválida. Digite um número entre 0 e 4, conforme Menu de Opções!");
                                    break;
                            }
                        } else System.out.println("Só é possível usar números inteiros");
                    } else System.out.println("Só é possível usar números inteiros");
                } else System.out.print("Opção inavalida, escolha entre 1 e 4 !");
                System.out.println("\nBem-vindo ao Menu de Opções!");
                System.out.println("Escolha uma opção:");
                System.out.println("1 - Somar dois números");
                System.out.println("2 - Subtrair dois números");
                System.out.println("3 - Multiplicar dois números");
                System.out.println("4 - Dividir dois números");
                System.out.println("0 - Sair");
                System.out.print("Digite sua opção: ");
                opcao = entradaOpcao.nextInt();
            } System.out.print("O programa será encerrado!");
            entrada.close();
        }
    }
