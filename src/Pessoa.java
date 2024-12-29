public class Pessoa {
    public String nome;
    public String email;
    public String cpf;

    public String exibirDados() {
        return """
                === Dados da Pessoa ===
                Nome:  %s
                Email: %s
                CPF: %s
                """.formatted(this.nome,this.email,this.cpf);
    }
/*        return "=== Dados da Pessoa ===" + "\n" +
                "Nome: " + this.nome + "\n" +
                "Email: " + this.email + "\n" +
                "CPF: " + this.cpf;
    }*/
}

