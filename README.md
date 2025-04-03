
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
[x]Cadastrar livros no sistema 📚.
[x]Cadastrar estudantes no sistema 🎓.
[x]Realizar empréstimos de livros disponíveis 📘.
[x]Consultar livros disponíveis 🔍.

⚖️ Regras de negócio:

Um livro só pode ser emprestado se estiver disponível ✅.
Após o empréstimo, o status do livro deve mudar para indisponível ❌.

💡 Dicas:

Utilize listas para armazenar os livros e estudantes 📂.
Faça a verificação de disponibilidade do livro no momento do empréstimo ⚠️.
Use laços de repetição e condicionais para navegar pelas funcionalidades 🔄.
