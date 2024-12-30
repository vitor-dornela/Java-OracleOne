import java.util.Scanner;

public class Operacoes {
    Scanner sc = new Scanner(System.in);

    public void executarOperacao() {
        int numeroDigitado = sc.nextInt();

        switch (numeroDigitado) {
            case 1:
                System.out.println("Consultar saldos");
                break;
            case 2:
                System.out.println("Receber valor");
                break;
            case 3:
                System.out.println("Transferir valor");
                break;
            case 4:
                break;
            default:
                System.out.println("Entrada inválida, tente novamente");
        }
    }
}
