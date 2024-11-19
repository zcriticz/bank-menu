import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        String nameClient = "Cristian Santos";
        String accountType = "Conta Corrente";
        double bankBallance = 2500.50;

        System.out.println("Bem vindo ao nosso banco\n\nDados do cliente:\n");
        System.out.println("Nome: " + nameClient + "\n" + "Tipo da conta: " + accountType + "\n" + "Saldo inicial: " + bankBallance + "\n");

        String menuOptions = """
                1 - Verificar saldo
                2 - Fazer deposito
                3 - Transferir para outra conta
                4 - Sair
                """;
        int options = 0;

        while (options != 4) {
            System.out.println(menuOptions);
            System.out.println("Digite a opção desejada:");
            options = inputValue.nextInt();

            if (options == 1) {
                System.out.println("\nSeu saldo atual é de: " + bankBallance + "\n");
            } else if (options == 2) {
                System.out.println("\nDigite o valor que deseja depositar:\n");
                double receive = inputValue.nextDouble();
                bankBallance += receive;
                System.out.println("\nSeu novo saldo é de: " + bankBallance + "\n");
            } else if (options == 3) {
                System.out.println("\nDigite o valor que deseja transferir:\n");
                double retire = inputValue.nextDouble();
                if (retire > bankBallance) {
                    System.out.println("\nSaldo insuficiente.\n");
                } else {
                    bankBallance -= retire;
                    System.out.println("\nSaldo atualizado: " + bankBallance + "\n");
                }
            } else if (options != 4) {
                System.out.println("\nOpção inválida. Tente novamente\n");
            }
        }
    }
}
