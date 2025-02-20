package com.mycompany.atividade._02_25;
// Academico: Rodrigo Estevão Rottava RA: 60001962

class Livro {
    String titulo;
    String genero;
    String anoDePulicação;
    boolean disponivelVenda;
    
    void verificarDisponibilidade() {
        System.out.println("Este livro " + titulo + genero + "ta disponivel para compra? " + disponivelVenda);
    }
}

class Autor {
    String name;
    String nacionalidade;
    String dataDeNascimento;
    
    void descricaoAutor() {
        System.out.println("Autor: " + name + "Nacionalidade: " + nacionalidade + "Data de Nascimento: " + dataDeNascimento);
    }
}

class Cliente {
    String name;
    String email;
    String telefone;
    
    void compraRealizada() {
        System.out.println("O expositor " + name + " fez uma compra");
    }
}

public class Atividade20_02_25 {
    public static void main(String[] args){
    
    Livro livro = new Livro();
    livro.titulo = "Lebron James o GOAT ";
    livro.genero = "Baseado em fatos reais ";
    livro.anoDePulicação = "2027";
    livro.disponivelVenda = true;
    
    Autor autor = new Autor();
    autor.name = "Lucas B. C, ";
    autor.nacionalidade = "EUA ";
    autor.dataDeNascimento = "19/09/1990";
    
    Cliente cliente = new Cliente();
    cliente.name = "Rodrigo Rottava";
    cliente.email = "r.rottava@edu.unipar.br";
    cliente.telefone = "60001962";
    
    livro.verificarDisponibilidade();
    autor.descricaoAutor();
    cliente.compraRealizada();
    
    }
}