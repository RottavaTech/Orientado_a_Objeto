/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package rotts.tratamentoexcecoes1;

/**
 @author Rodrigo Rottava
 * RA: 60001962 - ADS Unipar
 * Atividade 4 Avaliativa - Tratamento de Exceções 1
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoExcecoes1 {

    public static void main(String[] args) {
        System.out.println("Tratamento de Excecoes\n");
        divisaoCTratamento();
        conversaoTextPInteiro();
        acessoIndiceVetor();
        somaCValidacao();
    }

    // 1
    public static void divisaoCTratamento() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Divisao:");
        try {
            System.out.print("Coloque o primeiro numero: ");
            int a = sc.nextInt();
            System.out.print("Coloque o segundo numero: ");
            int b = sc.nextInt();

            int resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("ERROR: Nao e possível dividir por zero");
        } catch (InputMismatchException e) {
            System.out.println("ERROR: Entrada invalida coloque numeros inteiros");
        }
        sc.nextLine(); // limpar buffer
        System.out.println();
    }

    // 2
    public static void conversaoTextPInteiro() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Conversao de texto para inteiro");
        System.out.print("Coloque um numero inteiro: ");

        try {
            String entrada = sc.nextLine();
            int numero = Integer.parseInt(entrada);
            System.out.println("Numero digitado: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("ERROR: Valor digitado não e um número inteiro valido");
        }
        System.out.println();
    }

    // 3
    public static void acessoIndiceVetor() {
        Scanner sc = new Scanner(System.in);
        int[] vetor = {10, 20, 30};

        System.out.println("Acesso a vetor com o indice validado");
        try {
            System.out.print("Coloque o indice (0 a 2): ");
            int indice = sc.nextInt();
            System.out.println("Valor no indice " + indice + ": " + vetor[indice]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ERROR: indice fora do limite do vetor");
        } catch (InputMismatchException e) {
            System.out.println("ERROR: Entrada invalida Coloque um numero inteiro");
        }
        sc.nextLine(); // limpar buffer
        System.out.println();
    }

    // 4
    public static void somaCValidacao() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Soma");
        try {
            System.out.print("Coloque o primeiro numero: ");
            int num1 = Integer.parseInt(sc.nextLine());
            System.out.print("Coloque o segundo numero: ");
            int num2 = Integer.parseInt(sc.nextLine());

            int soma = num1 + num2;
            System.out.println("Resultado da soma: " + soma);
        } catch (NumberFormatException e) {
            System.out.println("ERROR: Entrada invalida Coloque numeros inteiros");
        }
        System.out.println();
    }
}