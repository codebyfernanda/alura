import java.util.Scanner;

public class Desafio { // Não esquecer: Nome da classe é com letra maiúscula!!!
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        
        String nomeCliente = "Ana Nascimento";
        String tipoConta = "Corrente";
        double saldoEmConta = 10000.00;
        int opcao = 0;

        System.out.println("********************************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("Nome:           " + nomeCliente);
        System.out.println("Tipo conta:     " + tipoConta);
        System.out.printf("Saldo inicial:  R$ %.2f%n", saldoEmConta);
        System.out.println("********************************************");

        String menu = """
                
                ** Digite a sua opção **
                1 - Consultar saldo
                2 - Enviar PIX
                3 - Receber PIX
                4 - Sair
                
                """;

        while (opcao != 4) {
            System.out.print(menu);
            opcao = leitura.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("O seu saldo atualizado é R$ %.2f%n", saldoEmConta);
                    break;
                case 2:
                    System.out.println("Qual é o valor que deseja transferir?");
                    double valorSaida = leitura.nextDouble();
                    if (valorSaida > saldoEmConta) {
                        System.out.println("Não há saldo suficiente para realizar a transferência!");
                    } else {
                        saldoEmConta -= valorSaida;
                        System.out.printf("Transferência realizada! Novo saldo: R$ %.2f%n", saldoEmConta);
                    }
                    break;
                case 3:
                    System.out.println("Qual é o valor que deseja receber?");
                    double valorEntrada = leitura.nextDouble();
                    saldoEmConta += valorEntrada;
                    System.out.printf("Valor recebido! Novo saldo: R$ %.2f%n", saldoEmConta);
                    break;
                case 4:
                    System.out.println("Encerrando o sistema. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
        leitura.close(); // Essa é uma boa prática porque fecha o scanner ao finalizar a execução
    }
}
