/**Você está trabalhando em uma startup voltada para educação, e ficou responsável por criar a lógica de uma das atividades. 
 * Seu programa deve receber o valor dos três lados de um triângulo, e informar se ele é equilátero, isósceles ou escaleno. 
 * Restrição: Em um triângulo, o comprimento de um lado é sempre menor do que a soma dos outros dois!*/
 // equilatero é tres lados iguais
 //iso são dois lados iguais e um diferente 
 // escaleno os tres lados diferentes
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ladoA;
        int ladoB;
        int ladoC;

        System.out.println("Informe o valor dos três lados do triangulo: ");
        ladoA = input.nextInt();
        ladoB = input.nextInt();
        ladoC = input.nextInt();

        if (ladoA + ladoB < ladoC || ladoB + ladoC < ladoA || ladoA + ladoC < ladoB) {
            System.out.println("Não é um triângulo válido. Os valores não correspondem a um triângulo.");
            return;
        }

        if (ladoA == ladoB && ladoB==ladoC) {
            System.out.println("Seu triangulo é equilátero.");
        }
        else if (ladoA != ladoB && ladoB != ladoC) {
            System.out.println("Seu triangulo é isósceles.");
        }
        else {
            System.out.println("Seu triangulo é escaleno.");
        }

       
        input.close();
    }
}
