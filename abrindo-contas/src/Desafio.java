import java.util.Scanner;

public class Desafio {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int numeroConta = scanner.nextInt();
    scanner.nextLine();

    String nomeTitular = scanner.nextLine();

    double saldo = scanner.nextDouble();

    scanner.close();

    ContaBancaria c1 = new ContaBancaria(numeroConta, nomeTitular, saldo);

    System.out.println("Informacoes:");
    System.out.println("Conta: " + c1.numero);
    System.out.println("Titular: " + c1.titular);
    System.out.println("Saldo: R$ " + c1.saldo);
  }
}

class ContaBancaria {
  int numero;
  String titular;
  double saldo;

  public ContaBancaria(int numero, String titular, double saldo) {
    this.numero = numero;
    this.titular = titular;
    this.saldo = saldo;
  }
}
