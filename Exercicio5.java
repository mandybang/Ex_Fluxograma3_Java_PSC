/**Escreva um programa em Java para determinar se o indivíduo está com um peso favorável. 
 * Essa situação é determinada através do IMC (Índice de Massa Corpórea), que é definida pela equação: IMC = pesoaltura2. 
 * A situação do peso é determinada pela tabela abaixo: Tabela no drive do exercicio.
 * 
 * Condição
Situação
IMC abaixo de 20
Abaixo do peso
IMC de 20 a 25
Peso Normal
IMC de 25 a 30
Sobrepeso
IMC de 30 a 40
Obeso
IMC de 40 e acima 
Obeso Mórbido


*/

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o seu peso atual em kg: ");
        double peso = input.nextDouble();

        System.out.println("Informe sua altura em centímetros: ");
        double altura = input.nextDouble() / 100; //converter cm em metros

        double imc = peso / (altura * altura);

        if (imc < 20) {
            System.out.println("Você está abaixo do peso.");
            
        }
        else if (imc >= 20 && imc < 25) {
            System.out.println("Você está com o peso normal.");
            
        }
        else if (imc >=25 && imc < 30) {
            System.out.println("Você está com sobrepeso.");
            
        }
        else if (imc >= 30 && imc < 40) {
            System.out.println("Você está obeso.");
            
        }
        else {
            System.out.println("Você está com obesidade mórbida.");
        }

       

        input.close();
    }
}
