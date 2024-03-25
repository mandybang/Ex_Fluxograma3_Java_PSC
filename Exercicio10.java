/**(Decom/UFOP) Na lojinha do Sr. Aboo, encontramos produtos de informática com preços especiais. 
 *Mas o Sr. Aboo segue uma receita de seus antepassados para acrescentar uma porcentagem sobre o valor de custo do produto, 
 garantindo assim, a estabilidade financeira das futuras gerações de sua família. A tabela abaixo, feita pelo avô do Sr. Aboo, 
 descreve o valor do lucro de um produto, considerando o valor de compra do mesmo.
Para auxiliar o Sr. Aboo, codifique um programa que leia o valor da compra de um produto de informática e 
imprima a porcentagem do lucro e o valor da venda.  O programa deve exibir a mensagem "Lojinha do Sr. Aboo" 
e em seguida solicitar o valor da compra com o fornecedor, e, em seguida, exibir qual será a porcentagem de lucro e 
o valor que o item deve ser colocado para venda.
*/

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valorProduto;
        double valorVenda;
        double lucro;
        double porLucro;

        System.out.println("Lojinha do S. Aboo! \n Digite o valor do produto:  ");
        valorProduto = input.nextDouble();

if ( valorProduto < 10) {
    porLucro = 70;
    lucro = valorProduto * (porLucro / 100);
    valorVenda = valorProduto + lucro;
    System.out.println("A porcentagem de lucro é de: " + porLucro);
    System.out.println("Você deverá vender por: R$" + valorVenda);
    
    
}

else if (valorProduto <= 30 || valorProduto < 50) {
    porLucro = 40;
    lucro = valorProduto * (porLucro / 100);
    valorVenda = valorProduto + lucro;
    System.out.println("A porcentagem de lucro é de: " + porLucro);
    System.out.println("Você deverá vender por: R$" + valorVenda);
}
else if (valorProduto >= 50) {
    porLucro = 30;
    lucro = valorProduto * (porLucro / 100);
    valorVenda = valorProduto + lucro;
    System.out.println("A porcentagem de lucro é de: " + porLucro);
    System.out.println("Você deverá vender por: R$" + valorVenda);
    
}
        input.close();
    }
    
}
