/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rotts.exercicioheranca2;

/**
 *
 * @author Rottava
 */
public class CalculadoraCientifica extends CalculadoraBasica {
    public double potencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }

    public double raizQuadrada(double num) {
        return Math.sqrt(num);
    }
}
