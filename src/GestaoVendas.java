

public class GestaoVendas {

    public static void main(String[] args){

        Produto p1 = new Produto(12,"Arroz", 6.20);
        Produto p2 = new Produto(13, "Feijão");
        p2.setPreco(8.89);

        ItemVenda iv1 = new ItemVenda(p1);
        ItemVenda iv2 = new ItemVenda(p2,25);

        iv1.exibirVenda();
        iv2.exibirVenda();

    }

}
