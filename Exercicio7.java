/**Escreva um programa em Java para ler: a descrição do produto (nome), a quantidade adquirida e o preço unitário.
 * Calcular e escrever o total (total = quantidade adquirida * preço unitário), o desconto e o total a pagar 
 * (total a pagar = total - desconto), sabendo-se que:
- Se quantidade <= 5, o desconto será de 2%
- Se quantidade > 5 e quantidade <=10, o desconto será de 3%
- Se quantidade > 10 e quantidade <30, o desconto será de 5%
- Se quantidade >= 30 o desconto será de 10%
*/

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        int qtd;
        double precoUn;

        System.out.println("Digite o nome do produto, sua quantidade e o preço do mesmo: ");
        nome = input.nextLine();
        qtd = input.nextInt();
        precoUn = input.nextDouble();

        double total = qtd * precoUn;
        double desconto;
        double totalPagar;

       
        if (qtd <= 5) {
            desconto = 0.02;
            totalPagar = total - (total * desconto);
            System.out.println("Você irá pagar o total de: R$" + totalPagar);
        } 
        else if (qtd > 5 && qtd <= 10) {
            desconto = 0.03;
            totalPagar = total - (total * desconto);
            System.out.println("Você irá pagar o total de: R$" + totalPagar);
        } 
        else if (qtd > 10 && qtd < 30) {
            desconto = 0.05;
            totalPagar = total - (total * desconto);
            System.out.println("Você irá pagar o total de: R$" + totalPagar);
        } 
        else if (qtd >= 30) {
            desconto = 0.1;
            totalPagar = total - (total * desconto);
            System.out.println("Você irá pagar o total de: R$" + totalPagar);
        } else {
            System.out.println("Quantidade inválida. Por favor, insira um número maior que zero.");
        }


        input.close();
    }
    
}
