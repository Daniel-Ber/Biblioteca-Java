
import java.util.Scanner;
public class Main {
    static  void tracado(int numTracado){
        for (int i = 1; i <= numTracado ; i++) {
            System.out.print("-");
        }
    }
    static void limpa(){
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca bibliotecaPrincipal = new Biblioteca();

        System.out.println("Bem vindo! Digite o que deseja.");
        System.out.print("Referente aos estudantes (1) , referente aos livros(2) : ");
        int escolha = sc.nextByte();

        //Referente aos estudantes
        if(escolha == 1 ){
            System.out.print("Para cadastrar estudantes(1), para fazer empréstimos(2) : ");
            escolha = sc.nextByte();
            //Cadastro de estudantes
            if (escolha == 1 ){
               String nome, matricula;
               sc.nextLine();
                System.out.print("Digite o nome do estudante:");
                nome = sc.nextLine();
                System.out.print("Digite a matricula do estudante:");
                matricula = sc.nextLine();
                Estudante novoEstudante = new Estudante(nome,matricula);
                novoEstudante.cadastrarEstudante(bibliotecaPrincipal);
            }//Empréstimos de estudantes
            else if (escolha == 2) {
                sc.nextLine();
                System.out.print("Digite a matricula do estudante : ");
                String matricula = sc.nextLine();
                System.out.print("Digite o id do livro: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Digite a data de empréstimo");
                String data = sc.nextLine();
                Livro livro = bibliotecaPrincipal.retornarLivro(id);
                Estudante estudante = bibliotecaPrincipal.retornarEstudanteCadastrado(matricula);
                Emprestimo emprestimo = new Emprestimo(estudante,livro,data);
                if (emprestimo.validacao){
                    //Mensagem já vai aparecer pela classe Emprestimo.
                    emprestimo.realizarEmprestimo(bibliotecaPrincipal);
                }else{
                    System.out.print("O empréstimo não foi realizado!");
                }
            }
        }

    }
}
