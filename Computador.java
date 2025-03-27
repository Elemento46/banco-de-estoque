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
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
    }
    
    // Método para cadastrar (entrada de dados)
    public void cadastrar(Scanner scanner) {
        System.out.print("Digite a marca: ");
        this.marca = scanner.nextLine();
        System.out.print("Digite o preço: ");
        this.preco = scanner.nextDouble();
        System.out.print("Digite a quantidade: ");
        this.quantidade = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer
    }

    // Método de entrada (ajustado)
    public void entrada(Scanner scanner) {
        System.out.print("Digite a marca: ");
        this.marca = scanner.nextLine();
        System.out.print("Digite o preço: ");
        this.preco = scanner.nextDouble();
        System.out.print("Digite a quantidade: ");
        this.quantidade = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer
    }
}

class Desktop1 extends Computador {
    private int placasVideo;
    private String tipoMemoria;
    private String marcaMemoria;
    private int numeroSlotsMemoria;
    private String tipoHD;
    private String marcaHD;
    private int capacidadeHD;
    private String tipoMonitor;
    private String marcaMonitor;
    private int resolucaoMonitor;
    private String tipoFonte;
    private String marcaFonte;
    private int potenciaFonte;
    private String marcaPlacaVideo;

    // Construtor
    public Desktop1(String marca, double preco, int quantidade, String tipoMemoria, int numeroSlotsMemoria, String tipoHD, int capacidadeHD) {
        super(marca, preco, quantidade);
        this.tipoMemoria = tipoMemoria;
        this.numeroSlotsMemoria = numeroSlotsMemoria;
        this.tipoHD = tipoHD;
        this.capacidadeHD = capacidadeHD;
    }

    public Desktop1() {
        //TODO Auto-generated constructor stub
    }

    // Métodos específicos
    public void configurarPlacaVideo(String marcaPlacaVideo, int potenciaFonte) {
        this.marcaPlacaVideo = marcaPlacaVideo;
        this.potenciaFonte = potenciaFonte;
    }
}

class Notebook extends Computador {
    private int slotsMemoria;
    private String tipoMemoria;
    private String marcaMemoria;
    private int numeroSlotsMemoria;
    private String tipoHD;
    private String marcaHD;
    private int capacidadeHD;
    private String tipoMonitor;
    private String marcaMonitor;
    private int resolucaoMonitor;
    private String tipoFonte;
    private String marcaFonte;
    private int potenciaFonte;

    // Construtor
    public Notebook(String marca, double preco, int quantidade, String tipoMemoria, int numeroSlotsMemoria, String tipoHD, int capacidadeHD) {
        super(marca, preco, quantidade);
        this.tipoMemoria = tipoMemoria;
        this.numeroSlotsMemoria = numeroSlotsMemoria;
        this.tipoHD = tipoHD;
        this.capacidadeHD = capacidadeHD;
    }

    public Notebook() {
        //TODO Auto-generated constructor stub
    }

    // Métodos específicos
    public void configurarBateria(String tipoFonte, int potenciaFonte) {
        this.tipoFonte = tipoFonte;
        this.potenciaFonte = potenciaFonte;
    }
}

class Servidor extends Computador {
    private int numeroHD;
    private int slotsMemoria;
    private String tipoMemoria;
    private String marcaMemoria;
    private int capacidadeMemoria;
    private String tipoHD;
    private String marcaHD;
    private int capacidadeHD;
    private String tipoGabinete;
    private String marcaGabinete;
    private String tipoFonte;
    private String marcaFonte;

    // Construtor
    public Servidor(String marca, double preco, int quantidade, int numeroHD, int capacidadeMemoria, int capacidadeArmazenamento, String tipoMemoria) {
        super(marca, preco, quantidade);
        this.numeroHD = numeroHD;
        this.capacidadeMemoria = capacidadeMemoria;
        this.capacidadeHD = capacidadeArmazenamento;
        this.tipoMemoria = tipoMemoria;
    }

    public Servidor() {
        //TODO Auto-generated constructor stub
    }

    // Métodos específicos
    public void configurarFonte(String tipoFonte, String marcaFonte) {
        this.tipoFonte = tipoFonte;
        this.marcaFonte = marcaFonte;
    }
}
