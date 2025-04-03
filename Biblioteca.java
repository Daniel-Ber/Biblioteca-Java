import java.util.ArrayList;
public class Biblioteca {
     private ArrayList<Livro> livrosCadastrados ;
     private ArrayList<Estudante> estudantesCadastrados ;
     private ArrayList<Emprestimo> emprestimosFeitos;

     Biblioteca(){
          this.livrosCadastrados = new ArrayList<>();
          this.estudantesCadastrados = new ArrayList<>();
          this.emprestimosFeitos = new ArrayList<>();
    }

    public void addLivro(Livro livro){
         livrosCadastrados.add(livro);
    }
    public void addEstudante(Estudante estudante){
         estudantesCadastrados.add(estudante);
    }
    public void  addEmprestimo(Emprestimo emprestimo){
         emprestimosFeitos.add(emprestimo);
    }

    public void mostrarEstudantesCadastrados(){
        System.out.println("Estudantes Cadastrados : ");
        for (int i = 0  ; i < this.estudantesCadastrados.size() ; i++ ){
            System.out.println("Nome: "+this.estudantesCadastrados.get(i).nome+"Matricula :"+this.estudantesCadastrados.get(i).matricula);
        }
    }
    public  void mostrarTodosLivros(){
        for (int i = 0 ; i < this.livrosCadastrados.size();  i++){
           if (this.livrosCadastrados.get(i).disponibilidade){
               System.out.println("Titulo: "+this.livrosCadastrados.get(i).titulo+" Disponibilidade: Disponivel");
           }else {
               System.out.println("Titulo: "+this.livrosCadastrados.get(i).titulo+" Disponibilidade: Indisponivel");
           }
        }
    }

    public void retirarEmprestimo(Emprestimo emprestimo){
        for (int i = 0; i <emprestimosFeitos.size() ; i++) {
            if (emprestimo == emprestimosFeitos.get(i)){
                emprestimosFeitos.remove(i);
                break;
            }
        }
    }

    public void mostrarEmpréstimos(){
        for (int i = 0; i < emprestimosFeitos.size(); i++){
           Emprestimo exemplo = emprestimosFeitos.get(i);
           System.out.println("O estudante : "+exemplo.estudante+" fez um empréstimo e agora está comm o livro : "+exemplo.livro);
        }
    }

    public void mostrarLivrosDisponiveis(){
        for (int i = 0; i < livrosCadastrados.size() ; i++) {
            if (livrosCadastrados.get(i).disponibilidade){
                System.out.println("Titulo: "+this.livrosCadastrados.get(i).titulo+" Disponibilidade: Disponivel");
            }
        }
    }









}