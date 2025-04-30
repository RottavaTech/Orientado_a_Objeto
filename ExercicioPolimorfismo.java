/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package rotts.exerciciopolimorfismo;

/**
 @author Rodrigo Rottava
 * RA: 60001962 - ADS Unipar
 * Atividade 1 Polimorfismo
 * Circulo e Retangulo implementam o mesmo método calcularArea()
 */
public class ExercicioPolimorfismo {
    public static void main(String[] args) {
        Forma f1 = new Circulo(5);
        Forma f2 = new Retangulo(4, 3);
        System.out.println("Area do Circulo: " + f1.calcularArea());
        System.out.println("Area do Retangulo: " + f2.calcularArea());
    }
}

