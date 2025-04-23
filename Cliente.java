/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rotts.exercicioheranca;

/**
 * @author Rodrigo Rottava
 * RA: 60001962 - ADS Unipar
 */
public class Cliente extends Pessoa {
    private int pontosFidelidade;

    public Cliente(String nome, String cpf, int pontos) {
        super(nome, cpf);
        this.pontosFidelidade = pontos;
    }

    public int getPontosFidelidade() {
        return pontosFidelidade;
    }
}

