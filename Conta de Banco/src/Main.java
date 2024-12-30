//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        definirClientes();
        System.out.println(mostrarMenu());

    }

    public static void definirClientes () {
        Cliente vitor = new Cliente();
        vitor.nome = "Vitor Dornela Mascarenhas";
        vitor.tipoConta = "Conta Corrente";
        vitor.saldoInicial = 1000;
        System.out.println(vitor.mostrarDados());

    }
    public static String mostrarMenu() {
        return """
                1 - Consultar saldos
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                
                Digite a opção desejada:
                """;
    }

}