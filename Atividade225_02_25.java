package com.mycompany.atividade._02_25;
// Academico: Rodrigo Estevão Rottava RA: 60001962
// Você deve encapsular (private) os atributos dessas classes, e criar métodos getts e setts para acessar os atributos. Na classe principal (Biblioteca) mostrar e modificar os atributos por meio do get e set.
//=============================================================================================================


class Livro {
    private String titulo;
    private String genero;
    private String anoDePublicacao;
    private boolean disponivelVenda;
   
    Livro(String titulo, String genero, String anoDePublicacao, boolean disponivelVenda) {
    this.titulo = titulo;
    this.genero = genero;
    this.anoDePublicacao = anoDePublicacao;
    this.disponivelVenda = disponivelVenda;
    }

    
    void verificarDisponibilidade() {
    System.out.println("O Livro " + titulo + ", de genero: " + genero + ", está disponivel para comprar? " + disponivelVenda);
    }

    
    public String getTitulo() {
    return titulo;
    } //Get

    public String getGenero() {
    return genero;
    } //Get

    public String getAnoDePublicacao() {
    return anoDePublicacao;
    } //Get

    public boolean isDisponivelVenda() {
    return disponivelVenda;
    } //Get

    
    public void setTitulo(String titulo) {
    this.titulo = titulo;
    } //Set

    public void setGenero(String genero) {
    this.genero = genero;
    } //Set

    public void setAnoDePublicacao(String anoDePublicacao) {
    this.anoDePublicacao = anoDePublicacao;
    } //Set

    public void setDisponivelVenda(boolean disponivelVenda) {
    this.disponivelVenda = disponivelVenda;
    } //Set
}


class Autor {
    private String nome;
    private String nacionalidade;
    private String dataDeNascimento;

    Autor(String nome, String nacionalidade, String dataDeNascimento) {
    this.nome = nome;
    this.nacionalidade = nacionalidade;
    this.dataDeNascimento = dataDeNascimento;
    }

    
    void descricaoAutor() {
    System.out.println("Autor: " + nome + ", Nacionalidade: " + nacionalidade + ", Data de Nascimento: " + dataDeNascimento);
    }

    
    public String getNome() {
    return nome;
    } //Get

    public String getNacionalidade() {
    return nacionalidade;
    } //Get

    public String getDataDeNascimento() {
    return dataDeNascimento;
    } //Get

    
    public void setNome(String nome) {
    this.nome = nome;
    } //Set

    public void setNacionalidade(String nacionalidade) {
    this.nacionalidade = nacionalidade;
    } //Set

    public void setDataDeNascimento(String dataDeNascimento) {
    this.dataDeNascimento = dataDeNascimento;
    } //Set
}


class Cliente {
    private String nome;
    private String email;
    private String telefone;

    Cliente(String nome, String email, String telefone) {
    this.nome = nome;
    this.email = email;
    this.telefone = telefone;
    }

    
    void compraRealizada() {
    System.out.println("O cliente " + nome + " fez uma compra.");
    }

    
    public String getNome() {
    return nome;
    } //Get

    public String getEmail() {
    return email;
    } //Get

    public String getTelefone() {
    return telefone;
    } //Get

    
    public void setNome(String nome) {
    this.nome = nome;
    } //Set

    public void setEmail(String email) {
    this.email = email;
    } //Set

    public void setTelefone(String telefone) {
    this.telefone = telefone;
    } //Set
}


public class Atividade225_02_25 {
    public static void main(String[] args) {

    Livro livro = new Livro("Lebron James: O GOAT", "Baseado em fatos reais", "2027", true);
    Autor autor = new Autor("Lucas B. C.", "EUA", "19/09/1990");
    Cliente cliente = new Cliente("Rodrigo Rottava", "r.rottava@edu.unipar.br", "60001962");

        
    System.out.println("\n|DADOS INICIAIS|");  //Dados Get
    System.out.println("Livro: " + livro.getTitulo() + ", Genero: " + livro.getGenero() + ", Ano de Publicacao: " + livro.getAnoDePublicacao() + ", Disponivel: " + livro.isDisponivelVenda());
    System.out.println("Autor: " + autor.getNome() + ", Nacionalidade: " + autor.getNacionalidade() + ", Data de Nascimento: " + autor.getDataDeNascimento());
    System.out.println("Cliente: " + cliente.getNome() + ", Email: " + cliente.getEmail() + ", Telefone: " + cliente.getTelefone());

       
    System.out.println("\n|ATUALIZANDO DADOS|");   //Dados Set
    livro.setTitulo("Michael Jordan: do Topo a Decadencia");
    livro.setDisponivelVenda(false);
    cliente.setEmail("rottava.rodrigo@gmail.com");
    cliente.setTelefone("4599829-4680");

        
    System.out.println("\n|DADOS ATUALIZADOS|");  //Agora é o Dados Atualizados
    System.out.println("Livro: " + livro.getTitulo() + ", Genero: " + livro.getGenero() + ", Ano: " + livro.getAnoDePublicacao() + ", Disponivel: " + livro.isDisponivelVenda());
    System.out.println("Cliente: " + cliente.getNome() + ", Email: " + cliente.getEmail() + ", Telefone: " + cliente.getTelefone());
    }
}