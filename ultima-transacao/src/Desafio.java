import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String entrada = scanner.nextLine();

        scanner.close();

        String[] partes = entrada.split(",");

        String data = partes[0].trim();
        String hora = partes[1].trim();
        String descricao = partes[2].trim();
        double valor = Double.parseDouble(partes[3].trim());

        Transacao t1 = new Transacao(data, hora, descricao, valor);

        t1.imprimir();
    }
}

class Transacao {
    private String data;
    private String hora;
    private String descricao;
    private double valor;

    public Transacao(String data, String hora, String descricao, double valor) {
        this.data = data;
        this.hora = hora;
        this.descricao = descricao;
        this.valor = valor;
    }

    public void imprimir() {
        System.out.println(this.descricao);
        System.out.println(this.data);
        System.out.println(this.hora);
        System.out.printf("%.2f", this.valor);
    }
}
