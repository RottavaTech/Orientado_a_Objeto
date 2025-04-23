/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rotts.exercicioheranca3;

/**
 *
 * @author Rottava
 */
public class Mamifero extends Animal {
    private String tipoPelagem;

    public Mamifero(String nome, int idade, String pelagem) {
        super(nome, idade);
        this.tipoPelagem = pelagem;
    }

    @Override
    public void emitirSom() {
        System.out.println("Rugido");
    }

    public void amamentar() {
        System.out.println("Mamifero esta amamentando");
    }
}



