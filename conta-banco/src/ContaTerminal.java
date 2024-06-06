import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            double saldo = 0;
            boolean continuar = true;
            while (continuar) {
                System.out.println("Escolha a opção desejada");
                System.out.println("1, Depositar");
                System.out.println("2, Sacar");
                System.out.println("3, Consultar saldo");
                System.out.println("4, Encerrar");

                int opcao = scanner.nextInt();
                
                switch (opcao) {
                    case 1:
                    System.out.println("Digite o valor a ser depositado:");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                        System.out.println("Saldo atual: " + String.format("%.1f", saldo));    
                        break;
                      
                    case 2:    
                    System.out.println("Digite o valor a ser sacado:");
                    double saque = scanner.nextDouble();
                    if (saque > saldo) {
                        System.out.println("Saldo insuficiente! Digite outro valor."); 
                    } else {
                        saldo -= saque;
                        System.out.println("Saldo atual: " + String.format("%1f", saldo));
                    }
                    break;
                    
                    case 3:
                        System.out.println("Saldo atual: " + String.format("%1f", saldo));
                    break;

                    case 4:
                        System.out.println("Operação encerrada");
                    continuar = false;
                    break;
                    default:
                        System.out.println("Operação invalida, tente novamente");
                }
            }
        }
        
    }
}
