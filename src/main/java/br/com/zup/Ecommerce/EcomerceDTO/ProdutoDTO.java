package br.com.zup.Ecommerce.EcomerceDTO;

public class ProdutoDTO {
    private String nomeDoProduto;
    private double valorDoProduto;

    public ProdutoDTO() {

    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public double getValorDoProduto() {
        return valorDoProduto;
    }

    public void setValorDoProduto(double valorDoProduto) {
        this.valorDoProduto = valorDoProduto;
    }
}
