/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package rotts.exercicioheranca3;

/**
 @author Rodrigo Rottava
 * RA: 60001962 - ADS Unipar
 */// Exercicio 3: Animal é superclasse, Mamifero e Ave herdam e sobrescrevem método emitirSom
public class ExercicioHeranca3 {
    public static void main(String[] args) {
        Mamifero leao = new Mamifero("Leao", 5, "Curta");
        Ave aguia = new Ave("Aguia", 3, true);

        leao.emitirSom();
        leao.amamentar();

        aguia.emitirSom();
        aguia.voar();
    }
}
