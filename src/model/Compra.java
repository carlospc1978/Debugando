package model;

import java.math.BigDecimal;
import java.util.List;

public class Compra {

    private List<Produtos>produtos;

    public List<Produtos> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produtos> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "produtos=" + produtos +
                '}';
    }
}
