
> [!NOTE]
> Status: **Em desenvolvimento**

# Biblioteca Java
Sistema de uma Biblioteca em java.
Feito com o objetivo de aprimorar minhas habilidades com Java.
Promovido pelo [Shaulin](https://youtube.com/@shaulinsmb?si=zC-k2PJXkCNmjYLu) em sua comunidade do discord




📚 Desafio: Sistema de Biblioteca em Java
🎯 Objetivo:
Criar um sistema básico de biblioteca em Java (caso queira fazer em outra linguagem, fique a vontade)
que permita o cadastro de livros e a realização de empréstimos para estudantes.

📋 Requisitos:

Classes principais:

Livro:
Atributos: id (int), título 📖, autor ✍️, disponível ✅/❌.
Métodos: cadastrarLivro(), exibirDetalhes().


Estudante:
Atributos: nome 👤, matrícula 🎓.
Métodos: cadastrarEstudante(), exibirDetalhes().

Empréstimo:
Atributos: livro (Livro) 📘, estudante (Estudante) 👤, data de empréstimo 📅.
Métodos: realizarEmprestimo().

Funcionalidades obrigatórias:
Cadastrar livros no sistema 📚.
Cadastrar estudantes no sistema 🎓.
Realizar empréstimos de livros disponíveis 📘.
Consultar livros disponíveis 🔍.

⚖️ Regras de negócio:

Um livro só pode ser emprestado se estiver disponível ✅.
Após o empréstimo, o status do livro deve mudar para indisponível ❌.


