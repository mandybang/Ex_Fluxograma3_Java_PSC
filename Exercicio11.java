/**Crie um programa para exibir o menu de um caixa eletrônico. 
 * Ele deve possuir as opções: Exibir saldo, Exibir extrato, Realizar depósito, 
 * Realizar saque, e Sair. Se alguma opção inválida for fornecida, exiba uma mensagem de erro e saia do programa. 
 * Observação: Utilize a estrutura de seleção Switch/Case para implementar seu produto. 
 * Utilize números inteiros para indicar cada opção.

*/
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int saldo = 100000;
        int saque, deposito;
            
        
        while (true) {
            System.out.println("Caixa Eletrônico");
            System.out.println("Escolha uma opção:");
            System.out.println("1. Exibir saldo");
            System.out.println("2. Realizar depósito");
            System.out.println("3. Realizar saque");
            System.out.println("4. Sair");
            System.out.print("Digite o número da operação desejada: ");
            int escolha = input.nextInt();
            input.nextLine(); // Limpar o buffer do teclado
     
            switch (escolha) {
         case 1:
             System.out.println("Saldo atual: R$" + saldo);

             System.out.print("Deseja realizar uma nova ação? Digite S para sim ou N para não: ");
             String sN = input.nextLine();
             if (sN.equalsIgnoreCase("S")) // verifica se a string sN é igual (ignorando maiúsculas e minúsculas) à string "S".
              {
                 System.out.println("Estamos voltando você para o menu inicial.");
             } else if (sN.equalsIgnoreCase("N")) {
                 System.out.println("Estamos saindo do programa. Obrigado!");
                 input.close(); // Fechar o Scanner antes de sair do programa
                 return; // Terminar o programa
             }
             break;

         case 2:
             System.out.print("Digite o valor a ser depositado: R$");
             deposito = input.nextInt();
             saldo += deposito; // saldo += deposito é como se fosse saldo = saldo + deposito.
             System.out.println("Depósito realizado com sucesso!");
             break;

         case 3:
             System.out.print("Digite o valor a ser sacado: R$");
             saque = input.nextInt();
             if (saldo >= saque) {
                 saldo -= saque;
                 System.out.println("Retire seu dinheiro.");
             } else {
                 System.out.println("Saldo insuficiente.");
             }
             break;

             case 4:
             System.out.println("Obrigado por utilizar nosso caixa eletrônico. Até logo!");
             input.close(); // Fechar o Scanner antes de sair do programa 
             return; // Terminar o programa
         default:
             System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
             return;
     }
 }
} 
}
