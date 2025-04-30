/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package rotts.exerciciopolimorfismo3;

/**
 @author Rodrigo Rottava
 * RA: 60001962 - ADS Unipar
 * Atividade 3 Polimorfismo
 * Circulo e Retangulo herdam da classe abstrata e implementam calcularArea()
 */
public class ExercicioPolimorfismo3 {
    public static void main(String[] args) {
        Forma circulo = new Circulo(77);
        Forma retangulo = new Retangulo(2, 3);

        System.out.println("Area do Circulo: " + circulo.calcularArea());
        System.out.println("Area do Retangulo: " + retangulo.calcularArea());
    }
}

