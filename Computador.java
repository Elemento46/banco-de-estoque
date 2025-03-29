import java.util.Scanner;

public class Computador {
    private String marca;
    private double preco;
    private int quantidade;

    // Construtores
    public Computador() {}

    public Computador(String marca, double preco, int quantidade) {
        this.marca = marca;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Getters e Setters
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    
    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }
    
    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }
    
    // Método para imprimir os dados
    public void imprimir() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade disponível: " + quantidade);
    }
    
    // Método para entrada de dados
    public void entrada(Scanner scanner) {
        System.out.print("Digite a marca: ");
        this.marca = scanner.nextLine();
        System.out.print("Digite o preço: ");
        this.preco = scanner.nextDouble();
        System.out.print("Digite a quantidade disponível: ");
        this.quantidade = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer
    }
}
