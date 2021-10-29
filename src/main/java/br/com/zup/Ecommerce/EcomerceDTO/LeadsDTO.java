package br.com.zup.Ecommerce.EcomerceDTO;

import java.util.List;

public class LeadsDTO {
    private String email;
    private String nome;
    private String telefone;
    private ProdutoDTO produtoDTOS;

    public LeadsDTO() {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ProdutoDTO getProdutoDTOS() {
        return produtoDTOS;
    }

    public void setProdutoDTOS(ProdutoDTO produtoDTOS) {
        this.produtoDTOS = produtoDTOS;
    }
}
