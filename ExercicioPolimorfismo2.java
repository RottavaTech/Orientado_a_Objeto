/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package rotts.exerciciopolimorfismo2;

/**
 @author Rodrigo Rottava
 * RA: 60001962 - ADS Unipar
 * Atividade 2 Polimorfismo
 * Cada classe faz uma operação diferente (soma, subtração, etc)
 */
public class ExercicioPolimorfismo2 {
    public static void main(String[] args) {
        OperacaoMatematica soma = new Soma();
        OperacaoMatematica sub = new Subtracao();
        OperacaoMatematica mult = new Multiplicacao();
        OperacaoMatematica div = new Divisao();

        int a = 23, b = 27;

        System.out.println("Soma: " + soma.calcular(a, b));
        System.out.println("Subtracao: " + sub.calcular(a, b));
        System.out.println("Multiplicacao: " + mult.calcular(a, b));
        System.out.println("Divisao: " + div.calcular(a, b));
    }
}

