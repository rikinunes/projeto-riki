import java.util.Scanner;
public class exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        System.out.println("dijite um numero ");
        int Numero = entrada.nextInt();
        if (Numero % 2 ==0) {
            System.out.println("seu numero e par !");
        } else {
            System.out.println(" seu numero e impar  !");
        }
    }
}