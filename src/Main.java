//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Definindo um objeto pessoa.
        Pessoa andre = new Pessoa();
        andre.nome = "André Silva";
        andre.email = "andre@email.com";
        andre.cpf = "1111111-11";
        System.out.println(andre.exibirDados());

        //Definindo um outro objeto pessoa.
        Pessoa helen = new Pessoa();
        helen.nome = "Helen Cardoso";
        helen.email = "helen@email.com";
        helen.cpf = "2222222-22";
        System.out.println(helen.exibirDados());
        }
    }