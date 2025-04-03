public class Estudante {
    String nome, matricula;
    Livro leituraAtual;

    Estudante(String nome , String matricula){
        this.matricula = matricula;
        this.nome = nome;
    }

    public void exibirDetalhes(){
        System.out.println("Nome : "+nome + ". Matricula: "+ matricula );
    }

    public void mostrarLeituraAtual (){
        System.out.println("Estudante: "+nome+". Leitura atual: "+leituraAtual.titulo );
    }
    public void cadastrarEstudante(Biblioteca biblioteca){
        biblioteca.addEstudante(this);
    }

}
