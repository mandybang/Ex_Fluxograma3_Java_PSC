/**Crie um algoritmo que leia dois números e exiba o resultado da divisão entre eles. 
 * O algoritmo deverá seguir todas as regras da divisão de números reais. */

 import java.util.Scanner;

 public class Exercicio1 {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1;
        int n2;

        System.out.println("Digite dois números: ");
    
        while (true) {
            n1 = input.nextInt();
            if (n1 == 0) {
                System.out.println("Zero dividido por qualquer número é zero.");
                break; // Sai do loop se o p6rimeiro número for zero
            }

            n2 = input.nextInt();

            if (n2 != 0) {
                double divisão = n1 / n2;
                System.out.println("O resultado da divisão dos dois números é: " + divisão);
                break;
            } else {
                System.out.println("Erro: Divisão por zero não é permitida.");
                break;
            }
        }
        System.out.println("Programa encerrado.");
        input.close();

    }
}