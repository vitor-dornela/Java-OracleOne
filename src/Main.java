public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        //Média calculada pelas 3 notas da Jack, Paulo e Suelem
        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media /2);
        System.out.println(classificacao);
    }

    public static void objetosPessoa () {
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