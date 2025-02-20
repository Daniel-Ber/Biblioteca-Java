public class Emprestimo {
    Livro livro;
    Estudante estudante;
    String dataEmprestimo;

    //Acredito que não precisa de um métdo realizarEmprestimo() o empréstimo em si como objeto já funciona
    Emprestimo(Estudante estudante, Livro livro ,String dataEmprestimo){
        if (livro.disponibilidade){
            this.livro = livro;
            this.livro.disponibilidade = false;
            this.livro.alunoLeitorAtual = estudante;
            this.estudante = estudante;
            this.estudante.leituraAtual = livro;
            this.dataEmprestimo = dataEmprestimo;
            System.out.println("O empréstimo do livro "+ this.livro.titulo + " foi feito para o aluno "+ this.estudante.nome);
        }else{
            System.out.println("Este livro : "+ livro.titulo+" não está disponivel.");
        }

    }

    public void desfazEmpréstimo(){
        this.livro.disponibilidade = true;
        this.estudante.leituraAtual = null;
        this.livro = null;
        this.estudante = null;
        this.dataEmprestimo = null;
    }



    }


