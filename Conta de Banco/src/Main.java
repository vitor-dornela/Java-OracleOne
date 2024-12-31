import java.util.Scanner;

import static java.awt.SystemColor.menu;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        definirClientes();
        executarOperacao();

    }

    static Cliente vitor;

    public static void definirClientes () {
        vitor = new Cliente();
        vitor.nome = "Vitor Dornela Mascarenhas";
        vitor.tipoConta = "Conta Corrente";
        vitor.saldo = 1000;
        System.out.println(vitor.mostrarDados());
    }
    public static void mostrarMenu() {
        String menu = """
                \n
                Operações
                
                1 - Consultar saldos
                2 - Receber valor
                3 - Transferir valor
                4 - Sair

                Digite a opção desejada:""";
        System.out.println(menu);
    }



    public static void executarOperacao() {
        Scanner sc = new Scanner(System.in);
        mostrarMenu();
        int numeroDigitado = sc.nextInt();


        switch (numeroDigitado) {
            case 1:
                // Consultar saldos
                System.out.println("\nSeu saldo atual: %.2f".formatted(vitor.saldo));

                executarOperacao();

            case 2:
                // Receber valor (adicionar valor)
                System.out.println("Digite o valor a ser recebido: ");
                double valorRecebido = sc.nextDouble();
                vitor.saldo += valorRecebido;
                System.out.println("\nSeu novo saldo é: %.2f".formatted(vitor.saldo));
                executarOperacao();

            case 3:
                // Transferir valor (retirar valor)
                System.out.println("Digite o valor a ser transferido: ");
                double valorTransferido = sc.nextDouble();
                if (valorTransferido <= vitor.saldo) {
                    vitor.saldo -= valorTransferido;
                    System.out.println("\nSeu novo saldo é: %.2f".formatted(vitor.saldo));
                    executarOperacao();
                } else {
                    System.out.println("\nSaldo insuficiente");
                    executarOperacao();
                    break;
                }

            case 4:
                // Sair
                break;

            default:
                System.out.println("\nEntrada inválida, tente novamente\n");
                executarOperacao();
        }
    }



}