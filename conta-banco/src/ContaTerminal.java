import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);

        System.out.println("------------ COLETA DE DADOS CONTA ------------");

        System.out.println("Por favor, digite o número da conta:");
        System.out.print(">>> ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência:");
        System.out.print(">>> ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o nome do cliente:");
        System.out.print(">>> ");
        String nome = scanner.next();

        System.out.println("Por favor, digite o saldo:");
        System.out.print(">>> ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

        scanner.close();

        System.out.println("------------ -------------------- ------------");
    }
}
