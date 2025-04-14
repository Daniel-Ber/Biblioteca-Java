public class Livro {
    int id;
    String autor, titulo;
    boolean disponibilidade ;
    Estudante alunoLeitorAtual;
    Livro(){

    }
    Livro(String autor , int id , boolean disponibilidade , String titulo){
        this.disponibilidade = disponibilidade;
        this.id = id;
        this.autor = autor ;
        this.titulo = titulo;
    }

    public  void cadastrarLivro(Biblioteca biblioteca){
        biblioteca.addLivro(this);
    }

    public void exibirDetalhes(){
        System.out.println("Autor : "+autor+ ". Titulo: "+titulo+ ". id: "+ id+ ". disponibilidade: "+ disponibilidade);
    }

}
