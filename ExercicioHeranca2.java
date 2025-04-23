/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package rotts.exercicioheranca2;

/**
 @author Rodrigo Rottava
 * RA: 60001962 - ADS Unipar
 */// Exercicio 2: CalculadoraCientifica herda de CalculadoraBasica e adiciona operações de potência e raiz

public class ExercicioHeranca2 {
    public static void main(String[] args) {
        CalculadoraCientifica calc = new CalculadoraCientifica();

        System.out.println("Soma: " + calc.somar(23, 1));
        System.out.println("Subtracao: " + calc.subtrair(27, 7));
        System.out.println("Potencia: " + calc.potencia(6, 1));
        System.out.println("Raiz Quadrada: " + calc.raizQuadrada(81));
    }
}
