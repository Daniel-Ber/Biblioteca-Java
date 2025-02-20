
public class Main {
    public static void main(String[] args) {
        Biblioteca b1 = new Biblioteca();
        Livro l1 = new Livro("Autor Livro l1", 1820, true , "Titulo livro l1");
        Estudante e4 = new Estudante("Nome 4 ", "Matricula 4");

        b1.cadastrarEstudantes(e4);
        b1.cadastrarLivro(l1);
        Emprestimo em1 = new Emprestimo(e4,l1,"DataEmprestimo");

        e4.mostrarLeituraAtual();
        l1.exibirDetalhes();
        

    }
}
