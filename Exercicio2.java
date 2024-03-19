/**Escreva um programa em Java para ler as notas da 1ª, 2ª e  3ª avaliações de um aluno. 
 * Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi ou não aprovado 
 * (considerar que média igual ou maior que 7 o aluno é aprovado). Escrever também a média calculada.
*/

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1;
        int n2;
        int n3;

        System.out.println("Digite suas três notas de avaliação: ");
        n1 = input.nextInt();
        n2 = input.nextInt();
        n3 = input.nextInt();

        int medAluno = (n1 + n2 + n3) / 3;

        System.out.println("Sua média foi de: " + medAluno);

        if (medAluno >= 7) {
            System.out.println("Aluno aprovado!");
            
        }
        else {
            System.out.println("Aluno reprovado!");
            
        }
        input.close();
        
    }
}
