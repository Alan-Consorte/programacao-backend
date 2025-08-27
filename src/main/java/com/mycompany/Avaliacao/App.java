import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema bancário!");

        // Criando as duas contas solicitadas
        System.out.println("\nCriando a primeira conta...");
        System.out.print("Digite o nome do titular da Conta 1: ");
        String titular1 = scanner.nextLine();
        ContaBancaria conta1 = new ContaBancaria(1, titular1);

        System.out.println("\nCriando a segunda conta...");
        System.out.print("Digite o nome do titular da Conta 2: ");
        String titular2 = scanner.nextLine();
        ContaBancaria conta2 = new ContaBancaria(2, titular2);

        System.out.println("\n--- Demonstração de Operações ---");
        
        // 1. Realizando depósitos
        conta1.depositar(100.0);
        conta2.depositar(50.0);
        
        // 2. Mostrando os saldos
        conta1.mostrarSaldo();
        conta2.mostrarSaldo();
        
        // 3. Realizando um saque
        conta1.sacar(30.0);
        
        // 4. Tentando sacar mais do que o saldo
        conta2.sacar(70.0);
        
        // 5. Realizando uma transferência
        conta1.transferir(40.0, conta2);
        
        // 6. Mostrando os extratos
        conta1.mostrarExtrato();
        conta2.mostrarExtrato();
        
        // 7. Tentando fechar a conta com saldo
        conta1.fecharConta();

        // 8. Sacando o restante para fechar a conta
        conta1.sacar(30.0);
        conta1.fecharConta();

        scanner.close();
    }
}