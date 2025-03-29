import java.util.ArrayList;
import java.util.Scanner;

public class CadastroComputadores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Computador> computadores = new ArrayList<>();

        while (true) {
            System.out.println("\nCadastro de Computadores");
            System.out.println("1 - Adicionar Desktop");
            System.out.println("2 - Adicionar Notebook");
            System.out.println("3 - Adicionar Servidor");
            System.out.println("4 - Listar Computadores");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            
            if (!scanner.hasNextInt()) { // Valida entrada numérica
                System.out.println("Opção inválida! Digite um número.");
                scanner.next(); // Descarta entrada inválida
                continue;
            }
            
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    System.out.println("\nCadastro de Desktop:");
                    Desktop novoDesktop = new Desktop();
                    novoDesktop.entrada(scanner);
                    computadores.add(novoDesktop);
                    System.out.println("✅ Desktop cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("\nCadastro de Notebook:");
                    Notebook novoNotebook = new Notebook();
                    novoNotebook.entrada(scanner);
                    computadores.add(novoNotebook);
                    System.out.println("✅ Notebook cadastrado com sucesso!");
                    break;

                case 3:
                    System.out.println("\nCadastro de Servidor:");
                    Servidor novoServidor = new Servidor();
                    novoServidor.entrada(scanner);
                    computadores.add(novoServidor);
                    System.out.println("✅ Servidor cadastrado com sucesso!");
                    break;

                case 4:
                    if (computadores.isEmpty()) {
                        System.out.println("\n📌 Nenhum computador cadastrado.");
                    } else {
                        System.out.println("\n=== Lista de Computadores Cadastrados ===");
                        for (Computador c : computadores) {
                            c.imprimir();
                            System.out.println("-----------------------");
                        }
                    }
                    break;

                case 5:
                    System.out.println("👋 Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("🚫 Opção inválida! Tente novamente.");
            }
        }
    }
}
