import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando objetos de cada tipo com valores válidos
        Desktop desktop1 = new Desktop();

        Notebook notebook1 = new Notebook();

        Servidor servidor1 = new Servidor();

        // Entrada manual de um objeto de cada tipo
        System.out.println("\nCadastro de um novo Desktop:");
        desktop1.entrada(scanner);

        System.out.println("\nCadastro de um novo Notebook:");
        notebook1.entrada(scanner);

        System.out.println("\nCadastro de um novo Servidor:");
        servidor1.entrada(scanner);

        // Exibição dos objetos criados
        System.out.println("\n=== Lista de Computadores Cadastrados ===");
        System.out.println("\n Desktops:");
        desktop1.imprimir();
        System.out.println("--------------------");

        System.out.println("\n Notebooks:");
        notebook1.imprimir();
        System.out.println("--------------------");

        System.out.println("\n Servidores:");
        servidor1.imprimir();
        System.out.println("--------------------");

        scanner.close();
    }
}
