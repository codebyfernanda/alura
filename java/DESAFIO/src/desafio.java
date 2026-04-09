import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        String nomeCliente = "Ana Nascimento";
        String tipoConta = "Corrente";
        double saldoEmConta = 10000.00;
        int contadorWhile = 0;

        System.out.println("============================");
        System.out.println("\nDados iniciais do cliente: ");
        System.out.println("Nome do cliente: " + nomeCliente);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo Atual: " + saldoEmConta);
        System.out.println("\n============================");

        String descritivoMenu = """
                \nDigite a opção desejada: 
                1- Consultar saldo 
                2- Enviar PIX
                3- Receber PIX 
                4- Sair
                """;
        Scanner leitura = new Scanner(System.in);

        while (contadorWhile != 4) {
            System.out.println(descritivoMenu);
            contadorWhile = leitura.nextInt();
            if (contadorWhile == 1) {
                System.out.println("O seu saldo atualizado é " + saldoEmConta);
            } else if (contadorWhile == 2) {
                System.out.println("Qual é o valor que deseja transferir via PIX? ");
                double valorNovo = leitura.nextDouble();
                if (valorNovo > saldoEmConta) {
                    System.out.println("Não há saldo suficiente para realizar a transferência!");
                } else {
                    saldoEmConta -= valorNovo;
                    System.out.println("Novo saldo: " + saldoEmConta);
                }
            } else if (contadorWhile == 3) {
                System.out.println("Qual é o valor que deseja receber via PIX? ");
                double valorNovo = leitura.nextDouble();
                saldoEmConta += valorNovo;
                System.out.println("O seu novo saldo é: " + saldoEmConta);
            } else if (contadorWhile != 4) {
                System.out.println("Opção inválida! Tente uma outra opção do menu");
            }
        }
    }
}
