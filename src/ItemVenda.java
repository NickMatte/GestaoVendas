
public class ItemVenda {

    private Produto produto;
    private int quantidade;

    public ItemVenda(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public ItemVenda(Produto produto){
        this.produto = produto;
        this.quantidade = 1;
    }

    public double calcularVenda(){

        return (this.produto.getPreco() * this.quantidade);
    }

    public void exibirVenda(){
        System.out.println("Codigo " + this.produto.getCodigo() + " | " + "" +
                            "Nome: "+ this.produto.getNome() + " | " +
                            "Quantidade: " + this.quantidade + " | " +
                            "Valor da compra: " + this.calcularVenda());
    }

}
