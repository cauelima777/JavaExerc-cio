class No {
    int valor;
    No proximo;

    public No(int valor) {
        this.valor = valor;
        this.proximo = null;
    }
}

class ListaOrdenada {
    No primeiro;

    public ListaOrdenada() {
        this.primeiro = null;
    }

    public void inserir(int valor) {
        No novoNo = new No(valor);
        if (primeiro == null || valor < primeiro.valor) {
            novoNo.proximo = primeiro;
            primeiro = novoNo;
        } else {
            No atual = primeiro;
            while (atual.proximo != null && valor > atual.proximo.valor) {
                atual = atual.proximo;
            }
            novoNo.proximo = atual.proximo;
            atual.proximo = novoNo;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ListaOrdenada lista = new ListaOrdenada();
        // Aqui você pode inserir seus números
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(3);
        lista.inserir(8);
        lista.inserir(2);
        // Continue inserindo até ter 20 números
    }
}
