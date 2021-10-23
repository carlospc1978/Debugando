package model;

import java.math.BigDecimal;

public class Produtos {

    String produto;

    public Produtos(String produto) {
        this.produto = produto;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }
}
