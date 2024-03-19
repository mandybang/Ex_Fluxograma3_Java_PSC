/**Escreva um programa em Java para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos. 
 * Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.
*/


import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numEleitores;
        int votoBranco;
        int votoNulo;
        int votoVal;

        System.out.println("Digite a quantidade total dos eleitores do municipio: ");
        numEleitores = input.nextInt();


        System.out.println("Digite a qtd de votos brancos, nulos e válidos respectivamente: ");
        votoBranco = input.nextInt();
        votoNulo = input.nextInt();
        votoVal = input.nextInt();

        double porcentagemB= (votoBranco * 100) / numEleitores;
        double porcentagemN = (votoNulo * 100) / numEleitores;
        double porcentagemV = (votoVal * 100) / numEleitores;

        System.out.println(" A porcentagem de votos Brancos foi de: " + porcentagemB + "%");
        System.out.println(" A porcentagem de votos Nulos foi de: " + porcentagemN + "%");
        System.out.println(" A porcentagem de votos Válidos foi de: " + porcentagemV + "%");


        input.close();
    }
}
