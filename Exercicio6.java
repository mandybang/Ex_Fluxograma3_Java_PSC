/**Escreva um programa que peça ao usuário que insira um número de 1 a 4, 
 * correspondendo a cada estação do ano (1 para Primavera, 2 para Verão, 3 para Outono, e 4 para Inverno) 
 * para identificar a estação escolhida e imprimir uma mensagem característica daquela estação.
*/

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int estação = 0;

        System.out.println("Digite um número de 1 a 4.");
        estação = input.nextInt();
        int primavera = 1;
        int verao = 2;
        int outono = 3;
        int inverno = 4;

        if (estação == 1) {
            System.out.println("Sua estação é Primavera 🌸🌷");
        }
        else if (estação == 2) {
            System.out.println("Sua estação é a Verão 🌅☀");
        }
        else if (estação == 3) {
            System.out.println("Sua estação é a Outono 🍁🍂");
        }
       else {
            System.out.println("Sua estação é a Inverno ❄☃");
       }

        input.close();
    }
    
}
