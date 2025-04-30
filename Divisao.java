/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rotts.exerciciopolimorfismo2;

/**
 @author Rodrigo Rottava
 * RA: 60001962 - ADS Unipar
 * Atividade 2 Polimorfismo
 */
public class Divisao implements OperacaoMatematica {
    @Override
    public int calcular(int a, int b) {
        if (b == 0) {
            return 0; // Evita a divisão por zero
        }
        return a / b;
    }
}

