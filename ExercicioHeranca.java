/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package rotts.exercicioheranca;

/**
 * @author Rodrigo Rottava
 * RA: 60001962 - ADS Unipar
 *///Exercicio 1: Demonstra herança simples onde Cliente herda Pessoa e adiciona pontos de fidelidade
public class ExercicioHeranca {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Kevyn Cazarotto", "102.168.169-55", -1000);
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Pontos Fidelidade: " + cliente.getPontosFidelidade());
    }
}
