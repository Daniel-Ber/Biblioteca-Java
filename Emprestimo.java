
public class Emprestimo {
    Livro livro;
    Estudante estudante;
    String dataEmprestimo;
    boolean validacao = false;
    Emprestimo(){

    }

    //Acredito que não precisa de um métdo realizarEmprestimo() o empréstimo em si como objeto já funciona
    Emprestimo(Estudante estudante, Livro livro, String dataEmprestimo ){
        if (livro.disponibilidade  && estudante != null){
            this.livro = livro;
            this.livro.disponibilidade = false;
            this.livro.alunoLeitorAtual = estudante;
            this.estudante = estudante;
            this.estudante.leituraAtual = livro;
            this.dataEmprestimo = dataEmprestimo;
            this.validacao = true;
            System.out.println("O empréstimo do livro "+ this.livro.titulo + " foi feito para o aluno "+ this.estudante.nome);
        }
        else if (estudante == null){
            System.out.print("Este estudante não esta cadastrado no sistema.");
        }
        else if(livro == null || livro.disponibilidade == false){
            System.out.println("Este livro : "+ livro.titulo+" não está disponivel ou não existe. ");
            System.gc();
        }
    }

    public void desfazEmpréstimo(Biblioteca biblioteca){
        this.livro.disponibilidade = true;
        this.estudante.leituraAtual = null;
        this.livro = null;
        this.estudante = null;
        this.dataEmprestimo = null;
        biblioteca.retirarEmprestimo(this);
    }

    public void realizarEmprestimo(Biblioteca biblioteca){
        if (this.validacao){
            cadastrarEmprestimo(biblioteca);
        }
    }

    private void cadastrarEmprestimo(Biblioteca biblioteca){
        if (this.livro.disponibilidade == false && this.livro.alunoLeitorAtual != null && this.estudante.leituraAtual!= null){
            biblioteca.addEmprestimo(this);
        }
    }
}


