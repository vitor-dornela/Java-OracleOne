import java.util.Scanner;

public class LoopFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a avaliação para o filme: ");
            nota = sc.nextDouble();
            mediaAvaliacao += nota;

        }
        System.out.println("Média de avaliações " + mediaAvaliacao / 3);
    }


}
