import model.Compra;
import model.Produtos;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Principal {


    public static void main(String[] args) {

        List<Produtos>produtos=new ArrayList<Produtos>();
        Produtos banana = new Produtos("banana");

        produtos.add(banana);

        Compra compra = new Compra();
        compra.setProdutos(produtos);


    }






}
