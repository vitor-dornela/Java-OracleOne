package PrecoProduto;

public class TestePrecoProduto {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Produto 1");
        produto.setPrecoUnitario(10);

        double totalSemDesconto = produto.calcularPrecoTotal(1);
        System.out.println(String.format("Preço total sem desconto: R$ %.2f",totalSemDesconto));
        produto.aplicarDesconto(10);
        double totalComDesconto = produto.calcularPrecoTotal(1);
        System.out.println(String.format("Preço total sem desconto: R$ %.2f",totalComDesconto));

    }
}
