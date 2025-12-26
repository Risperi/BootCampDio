package Application;
import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {

    public static void main(String[] args) {
        // Criando o objeto scanner para ler a entrada do terminal
        // O useLocale(Locale.US) serve para aceitar o ponto (.) como separador decimal
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Entrada de dados
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da Conta:");
        int conta = scanner.nextInt();

        // Limpando o buffer do scanner antes de ler o nome
        scanner.nextLine(); 

        System.out.println("Por favor, digite o seu Nome Completo:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o seu Saldo atual:");
        double saldo = scanner.nextDouble();

        // Exibindo a mensagem final com concatenação
        System.out.println("Olá " + nomeCliente + 
            ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
            ", conta " + conta  + " e seu saldo " + saldo + " já está disponível para saque.");
        
        scanner.close();
    }
}