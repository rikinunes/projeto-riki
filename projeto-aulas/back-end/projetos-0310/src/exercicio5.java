import java.util.Scanner;
public class exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        System.out.println("dijite um numero ");
        int Numero = entrada.nextInt();
        if (Numero >= 1) {
            System.out.println("seu numero e positivo !");
        } else if (Numero <= -1 ){
            System.out.println(" seu numero e negativo!");
        } else {
            System.out.println("neutro ");
        }
    }
}
