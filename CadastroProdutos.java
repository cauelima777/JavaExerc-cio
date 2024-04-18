class Produto {
    int codigo;
    double preco;
    int quantidade;
    Produto proximo;

    public Produto(int codigo, double preco, int quantidade) {
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
        this.proximo = null;
    }
}

class ListaProdutos {
    Produto primeiro;

    public ListaProdutos() {
        this.primeiro = null;
    }

    public void cadastrarProduto(int codigo, double preco, int quantidade) {
        Produto novoProduto = new Produto(codigo, preco, quantidade);
        novoProduto.proximo = primeiro;
        primeiro = novoProduto;
    }
}

public class Main {
    public static void main(String[] args) {
        ListaProdutos lista = new ListaProdutos();
        lista.cadastrarProduto(1, 10.0, 20);
        lista.cadastrarProduto(2, 15.0, 15);
        lista.cadastrarProduto(3, 20.0, 30);
        lista.cadastrarProduto(4, 25.0, 25);
        lista.cadastrarProduto(5, 30.0, 10);
    }
}
