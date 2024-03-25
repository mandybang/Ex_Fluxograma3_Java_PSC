import java.util.Scanner;

public class Exercicio6_SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int estacao = 0;
      

        while (estacao != 5 ) {
            System.out.println("Digite 1: Verão");
            System.out.println("Digite 2: Outono");
            System.out.println("Digite 3: Primavera");
            System.out.println("Digite 4: Inverno");
            System.out.println("Digite 5 para interromper");
            estacao = input.nextInt();
            input.nextLine(); // Limpar o buffer do teclado
            
        
        switch (estacao) {
            case 1:
            System.out.println("Sua estacao é a Verão 🌅☀");
            break;

            case 2:
            System.out.println("Sua estacao é a Outono 🍁🍂");
            break;

            case 3:
            System.out.println("Sua estacao é Primavera 🌸🌷");
            break;

            case 4:
            System.out.println("Sua estacao é a Inverno ❄☃");
            break;
            
            case 5:
            System.out.println("Programa encerrado");
            input.close();
            return;
        
            default:
             System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
             break;
            }
        }
        
    }
    
}