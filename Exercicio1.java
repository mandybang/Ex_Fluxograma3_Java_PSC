/**Crie um algoritmo que leia dois números e exiba o resultado da divisão entre eles. 
 * O algoritmo deverá seguir todas as regras da divisão de números reais. */

 import java.util.Scanner;

 public class Exercicio1 {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1;
        int n2;

        System.out.println("Digite dois números: ");
        n1 = input.nextInt();
        n2 = input.nextInt();

        double divisão = n1 / n2;
        System.out.println("O resultado da divisão dos dois números é: " + divisão);


        input.close();
    }
 }