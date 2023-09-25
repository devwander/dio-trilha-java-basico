import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int saldoTotal = scanner.nextInt();
    int valorSaque = scanner.nextInt();
    scanner.close();

    if (saldoTotal >= valorSaque) {
      saldoTotal = saldoTotal - valorSaque;
      System.out.println("Saque realizado com sucesso. Novo saldo: " + saldoTotal);
    } else {
      System.out.println("Saldo insuficiente. Saque nao realizado!");
    }
  }
}