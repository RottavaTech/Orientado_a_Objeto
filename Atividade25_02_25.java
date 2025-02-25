package com.mycompany.atividade._02_25;
// Academico: Rodrigo Estevão Rottava RA: 60001962

class Livro {
    String titulo;
    String genero;
    String anoDePublicacao;
    boolean disponivelVenda;
   
    Livro(String titulo, String genero, String anoDePublicacao, boolean disponivelVenda){
    this.titulo = titulo;
    this.genero = genero;
    this.anoDePublicacao = anoDePublicacao;
    this.disponivelVenda = disponivelVenda;
}

    void verificarDisponibilidade() {
    System.out.println("O Livro " + titulo + ", de genero: " + genero + ", esta disponível para comprar? " + disponivelVenda);
    }
}

class Autor {
    String nome;
    String nacionalidade;
    String dataDeNascimento;

    Autor(String nome, String nacionalidade, String dataDeNascimento) {
    this.nome = nome;
    this.nacionalidade = nacionalidade;
    this.dataDeNascimento = dataDeNascimento;
}

    void descricaoAutor() {
    System.out.println("Autor: " + nome + ", Nacionalidade: " + nacionalidade + ", Data de Nascimento: " + dataDeNascimento);
    }
}

class Cliente {
    String nome;
    String email;
    String telefone;

    Cliente(String nome, String email, String telefone) {
    this.nome = nome;
    this.email = email;
    this.telefone = telefone;
}

    void compraRealizada() {
    System.out.println("O cliente " + nome + " fez uma compra.");
    }
}

public class Atividade25_02_25 {
    public static void main(String[] args) {

    Livro livro = new Livro("Lebron James: O GOAT", "Baseado em fatos reais", "2027", true);
    Autor autor = new Autor("Lucas B. C.", "EUA", "19/09/1990");
    Cliente cliente = new Cliente("Rodrigo Rottava", "r.rottava@edu.unipar.br", "60001962");
    
    livro.verificarDisponibilidade();
    autor.descricaoAutor();
    cliente.compraRealizada();
    }
}