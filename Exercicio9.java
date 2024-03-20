/**Decom/UFOP - Adaptado) A permissão para uma pessoa votar ou não é determinado pela idade dela, conforme a tabela:
 * Tabela no drive do exercicio.
Crie um programa capaz de ler a idade de uma pessoa e imprimir sua classificação eleitoral. 
Entrada: QUAL A IDADE DA PESSOA?: 17
Saída: ELEITOR FACULTATIVO
*/

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade;
        
        System.out.println("Qual a sua idade? ");
        idade = input.nextInt();

        if (idade >= 18 && idade <= 65) {
            System.out.println("Você é eleitor OBRIGATÓRIO");
            
        }
        else if (idade < 16) {
            System.out.println("Você não pode votar!");
            
        }
        else if (idade >= 16 || idade > 65) {
            System.out.println("Você é eleitor Facultativo.");
            
        }

        input.close();
    }
}
