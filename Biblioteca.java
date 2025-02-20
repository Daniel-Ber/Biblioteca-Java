import java.util.ArrayList;
public class Biblioteca {
     ArrayList<Livro> livrosCadastrados ;
     ArrayList<Estudante> estudantesCadastrados ;

    Biblioteca(){
          this.livrosCadastrados = new ArrayList<>();
        this.estudantesCadastrados = new ArrayList<>();
    }
    public void cadastrarLivro(Livro livro){
        this.livrosCadastrados.add(livro);
    }
    public void cadastrarEstudantes(Estudante estudante ){
        this.estudantesCadastrados.add(estudante);
    }
    public void mostrarEstudantesCadastrados(){
        System.out.println("Estudantes Cadastrados : ");
        for (int i = 0  ; i < this.estudantesCadastrados.size() ; i++ ){
            System.out.println("Nome: "+this.estudantesCadastrados.get(i).nome+"Matricula :"+this.estudantesCadastrados.get(i).matricula);
        }
    }
    public  void mostrarLivrosCadastradosDisponibilidades(){
        for (int i = 0 ; i < this.livrosCadastrados.size();  i++){
           if (this.livrosCadastrados.get(i).disponibilidade){
               System.out.println("Titulo: "+this.livrosCadastrados.get(i).titulo+" Disponibilidade: Disponivel");
           }else {
               System.out.println("Titulo: "+this.livrosCadastrados.get(i).titulo+" Disponibilidade: Indisponivel");
           }
        }
    }






}