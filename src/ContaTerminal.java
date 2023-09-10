import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        String agencia = " ";
        String nomeCliente = " ";
        double saldo = 0;

        System.out.println("Por favor, digite o número da Conta:");
        numero = scanner.nextInt();
        System.out.println("Por favor, digite o número da Agência:");
        agencia = scanner.next();
        scanner.nextLine();
        System.out.println("Por favor, digite o nome do cliente:");
        nomeCliente = scanner.nextLine();
        System.out.println("Por favor, digite o valor que deseja fazer o deposito:");
        saldo = scanner.nextDouble();

        System.out.println("Olá, "+nomeCliente+", Obrigado por criar uma conta em nosso banco, sua agência é " +
                ""+agencia+ ", conta "+numero+ " e seu saldo "+saldo+" já disponível para saque." );


    }
}
