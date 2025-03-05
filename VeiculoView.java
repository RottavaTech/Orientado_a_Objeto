// Academico: Rodrigo Estevão Rottava RA: 60001962
// View
//=============================================================================================================


package atividade.view;

import java.util.Scanner;

public class VeiculoView {
    
    private Scanner scanner = new Scanner(System.in);

    public String obterMarca() {
    System.out.print("Coloque a Marca do seu Veiculo: ");
    return scanner.nextLine();
    }

    public String obterModelo() {
    System.out.print("Coloque o Modelo do seu Veiculo: ");
    return scanner.nextLine();
    }

    public int obterAno() {
    System.out.print("Coloque o Ano de seu Veiculo: ");
    return scanner.nextInt();
    }

    public void exibirVeiculo(String marca, String modelo, int ano) {
        
    System.out.println("Veiculo Inserido:");
    System.out.println("Marca: " + marca);
    System.out.println("Modelo: " + modelo);
    System.out.println("Ano: " + ano);
    
    }
}

