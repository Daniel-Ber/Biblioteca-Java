
public class Emprestimo {
    Livro livro;
    Estudante estudante;
    String dataEmprestimo;
    boolean validacao;
    Emprestimo(){

    }

    //Acredito que não precisa de um métdo realizarEmprestimo() o empréstimo em si como objeto já funciona
    Emprestimo(Estudante estudante, Livro livro, String dataEmprestimo, Biblioteca biblioteca ){
        if (livro.disponibilidade  && estudante != null){
            this.livro = livro;
            this.livro.disponibilidade = false;
            this.livro.alunoLeitorAtual = estudante;
            this.estudante = estudante;
            this.estudante.leituraAtual = livro;
            this.dataEmprestimo = dataEmprestimo;
            this.validacao = true;
            biblioteca.addEmprestimo(this);
            System.out.println("O empréstimo do livro "+ this.livro.titulo + " foi feito para o aluno "+ this.estudante.nome);
        }
        else if (estudante == null){
            System.out.print("Este estudante não esta cadastrado no sistema.");
            validacao = false;
        }
        else if(livro == null || livro.disponibilidade == false){
            System.out.println("Este livro : "+ livro.titulo+" não está disponivel ou não existe. ");
            validacao = false;
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

    public void realizarEmpréstimo(Estudante estudante , Livro livro , String dataEmpréstimo ){
        if (livro.disponibilidade){
            this.livro = livro;
            this.livro.disponibilidade = false;
            this.livro.alunoLeitorAtual = estudante;
            this.estudante = estudante;
            this.estudante.leituraAtual = livro;
            this.dataEmprestimo = dataEmpréstimo;
            System.out.println("O empréstimo do livro "+ this.livro.titulo + " foi feito para o aluno "+ this.estudante.nome);
        }else{
            System.out.println("Este livro : "+ livro.titulo+" não está disponivel. Este empréstimo não pode ser concluido no momento.");
        }
    }

    public void cadastrarEmprestimo(Biblioteca biblioteca){
        if (this.livro.disponibilidade == false && this.livro.alunoLeitorAtual != null && this.estudante.leituraAtual!= null){
            biblioteca.addEmprestimo(this);
        }else {
            if (this.livro.disponibilidade){
                System.out.println("Não é possivel cadastrar este empréstimo pois o livro está disponivel para qualquer um ler. ;");
            }
            if (this.livro.alunoLeitorAtual == null || this.estudante.leituraAtual == null){
                System.out.println("Não é possivel cadastrar este empréstimo pois o livro não tem leitor e/ou o aluno não está lendo nenhum livro");
            }
        }
    }
}


