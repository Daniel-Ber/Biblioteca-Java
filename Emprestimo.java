import java.sql.Date;
public class Emprestimo {
    Livro livro;
    Estudante estudante;
    Date dataEmpréstimo;

    Emprestimo(){

    }

    //Acredito que não precisa de um métdo realizarEmprestimo() o empréstimo em si como objeto já funciona
    Emprestimo(Estudante estudante, Livro livro, Date dataEmpréstimo, Biblioteca biblioteca ){
        if (livro.disponibilidade){
            this.livro = livro;
            this.livro.disponibilidade = false;
            this.livro.alunoLeitorAtual = estudante;
            this.estudante = estudante;
            this.estudante.leituraAtual = livro;
            this.dataEmpréstimo = dataEmpréstimo;
            biblioteca.addEmprestimo(this);
            System.out.println("O empréstimo do livro "+ this.livro.titulo + " foi feito para o aluno "+ this.estudante.nome);
        }else{
            System.out.println("Este livro : "+ livro.titulo+" não está disponivel.");
            System.gc();
        }
    }

    public void desfazEmpréstimo(Biblioteca biblioteca){
        this.livro.disponibilidade = true;
        this.estudante.leituraAtual = null;
        this.livro = null;
        this.estudante = null;
        this.dataEmpréstimo = null;
        biblioteca.retirarEmprestimo(this);
    }

    public void realizarEmpréstimo(Estudante estudante , Livro livro , Date dataEmpréstimo ){
        if (livro.disponibilidade){
            this.livro = livro;
            this.livro.disponibilidade = false;
            this.livro.alunoLeitorAtual = estudante;
            this.estudante = estudante;
            this.estudante.leituraAtual = livro;
            this.dataEmpréstimo = dataEmpréstimo;
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


