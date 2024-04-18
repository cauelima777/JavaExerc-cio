class Aluno {
    String nome;
    double notaFinal;
    Aluno proximo;
    Aluno anterior;

    public Aluno(String nome, double notaFinal) {
        this.nome = nome;
        this.notaFinal = notaFinal;
        this.proximo = null;
        this.anterior = null;
    }
}

class ListaAlunos {
    Aluno primeiro;

    public ListaAlunos() {
        this.primeiro = null;
    }

    public void cadastrarAluno(String nome, double notaFinal) {
        Aluno novoAluno = new Aluno(nome, notaFinal);
        if (primeiro == null) {
            primeiro = novoAluno;
        } else {
            Aluno atual = primeiro;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoAluno;
            novoAluno.anterior = atual;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ListaAlunos lista = new ListaAlunos();
        lista.cadastrarAluno("João", 8.5);
        lista.cadastrarAluno("Maria", 7.0);
        lista.cadastrarAluno("Pedro", 9.0);
        lista.cadastrarAluno("Ana", 6.5);
        lista.cadastrarAluno("Lucas", 8.0);
        lista.cadastrarAluno("Carla", 7.5);
    }
}
