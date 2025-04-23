/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rotts.exercicioheranca3;

/**
 *
 * @author Rottava
 */
public class Ave extends Animal {
    private boolean voa;

    public Ave(String nome, int idade, boolean voa) {
        super(nome, idade);
        this.voa = voa;
    }

    @Override
    public void emitirSom() {
        System.out.println("Piu piu");
    }

    public void voar() {
        if (voa) {
            System.out.println("A ave esta voando");
        } else {
            System.out.println("Esta ave não voa");
        }
    }
}

