/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package rotts.tratamentoexcecoes2;

/**
 @author Rodrigo Rottava
 * RA: 60001962 - ADS Unipar
 * Atividade 5 Avaliativa - Tratamento de Exceções 2
 */
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoExcecoes2 {

    // 1
    public static int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisao por zero nao e permitida");
        }
        return a / b;
    }

    // 2
    public static int converter(String texto) {
        if (texto == null || texto.isEmpty()) {
            throw new IllegalArgumentException("Entrada vazia ,coloque um numero");
        }
        return Integer.parseInt(texto);
    }

    // 3
    public static void verificarIdade(int idade) {
        if (idade < 18) {
            throw new IllegalArgumentException("Idade mínima é 18 anos");
        }
        System.out.println("Idade aceita: " + idade);
    }

    // 4
    public static void lerArquivo() {
        try {
            FileReader leitor = new FileReader("arquivo.txt");
            System.out.println("Arquivo aberto com sucesso");
        } catch (IOException e) {
            System.out.println("Erro ao abrir o arquivo: " + e.getMessage());
        }
    }

    // 5
    public static int somarPositivos(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("coloque numeros positivos são permitidos");
        }
        return a + b;
    }

    // 6
    public static double raizQuadrada(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor nao pode ser negativo");
        }
        return Math.sqrt(valor);
    }

    // 7
    public static void cadastrar(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome e obrigatorio");
        }
        System.out.println("Nome cadastrado: " + nome);
    }

    // 8
    public static void cadastrarProduto(String nome, double preco) {
        if (preco <= 0) {
            throw new IllegalArgumentException("Preco deve ser maior que zero");
        }
        System.out.println("Produto: " + nome + " - R$ " + preco);
    }

    // 9
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Escolha (1 a 3): ");
            int opcao = sc.nextInt();
            System.out.println("Opcao escolhida: " + opcao);
        } catch (InputMismatchException e) {
            System.out.println("ERROR: Você deve coloque um numero inteiro");
        }
    }

    // 10
    public static int somar(String a, String b) {
        try {
            return Integer.parseInt(a) + Integer.parseInt(b);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Entradas invalidas, coloque apenas numeros");
        }
    }

    // Metodo Main
    public static void main(String[] args) {
        System.out.println("Tratamento de Excecoes 2\n");

        // 1
        try {
            System.out.println("Divisao: " + dividir(10, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // 2
        try {
            System.out.println("Conversao: " + converter("123"));
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // 3
        try {
            verificarIdade(17);
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // 4
        lerArquivo();

        // 5
        try {
            System.out.println("Soma dos positivos: " + somarPositivos(10, 5));
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // 6
        try {
            System.out.println("Raiz quadrada: " + raizQuadrada(25));
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // 7
        try {
            cadastrar("Lucas Brunetto Cari");
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // 8
        try {
            cadastrarProduto("Mouse", 49.90);
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // 9
        menu();

        // 10
        try {
            System.out.println("Soma com strings: " + somar("27", "23"));
        } catch (NumberFormatException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
