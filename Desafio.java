import java.sql.SQLOutput;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //LEITURA DOS DADOS DO CLIENTE
        String nome = "Maraya Nores";
        String tipoConta = "Corrente";
        double saldo = 1600.00;

        System.out.println("***********************************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo Conta: " + tipoConta);
        System.out.println("Saldo Atual: " + saldo);
        System.out.println("\n***********************************************");


        //MENU DE OPÇÕES
        System.out.println("\nEscolha uma operação: \n");

        //OPÇÕES:
        System.out.println("1 - Consultar saldos");
        System.out.println("2 - Transferir um valor");
        System.out.println("3 - Receber um valor");
        System.out.println("4 - Sair");

        System.out.println("\nDigite sua escolha: ");
        int operacoes = scanner.nextInt();
        //SCANEANDO A OPÇÃO ESCOLHIDA PELO USUÁRIO

        switch (operacoes) {
            case 1:
                System.out.println("O saldo atualizado é: " + saldo);
            break;
            case 2:
                System.out.println("Qual é o valor que você deseja transferir?");
                double valor = scanner.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para efetuar essa transferência");
                } else {
                    saldo -= valor;
                }
                System.out.println("Seu saldo atual é: " + saldo);
                break;

            case 3:
                System.out.println("Valor recebido: ");
                double valorRecebido = scanner.nextDouble();
                saldo += valorRecebido;
                System.out.println("Novo saldo: " + saldo);
                break;

            case 4:
                System.out.println("Você escolheu a opção 4 - Sair");
                break;
            default:
                System.out.println("Você escolheu uma opção Inválida");
        }

        scanner.close();
    }
}
