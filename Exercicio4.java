/**Avalie o código abaixo e determine se suas saídas estão corretas. 
 * Primeiro, tente identificar a falha sem executar o programa; 
 * Em seguida, implemente e veja se acertou. Se houver erros, aponte-os e proponha e implemente as correções.
 * Código no drive do exercicio.
*/

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        
       // double salario; } váriavel antes do Scanner.
        Scanner entrada = new Scanner(System.in);

        double salario; //colocar váriavel após Scanner.
        double taxaAumento1 = 1.1;
        double taxaAumento2 = 1.2;
        double taxaAumento3 = 1.3;

        //System.out.println(); } retirar, pois está vazio 

        System.out.print("Por favor, informe o valor do salário atual: ");
        salario = entrada.nextDouble();

        if(salario <= 1000) {
            //salario *= taxaAumento3; } calculo escrito errado
           salario = salario * taxaAumento3;
        }

        else if (salario <= 2000) {
           // salario *= taxaAumento2; } calculo  escrito errado
           salario = salario * taxaAumento2;
        }

        if(salario <= 3000) {
            //salario *= taxaAumento1; } calculo escrito errado
         salario = salario * taxaAumento1;
        }

        //if (salario <= 4000) {
        else {
            salario = (salario * taxaAumento1) + 200;
        }

        //System.out.println(); } retirar, pois está vazio.
        System.out.printf("Novo Salário: R$ %.2f\n\n", salario);
    
        entrada.close();
    }
    
}
