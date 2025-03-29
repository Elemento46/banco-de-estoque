import java.util.Scanner;

public class Desktop extends Computador {
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

    // Construtores
    public Desktop() {}

    public Desktop(String marca, double preco, int quantidade, int placasVideo, String tipoMemoria,
                   String marcaMemoria, int numeroSlotsMemoria, String tipoHD, String marcaHD,
                   int capacidadeHD, String tipoMonitor, String marcaMonitor, int resolucaoMonitor,
                   String tipoFonte, String marcaFonte, int potenciaFonte, String marcaPlacaVideo) {
        super(marca, preco, quantidade);  // Chama o construtor da superclasse
        this.placasVideo = placasVideo;
        this.tipoMemoria = tipoMemoria;
        this.marcaMemoria = marcaMemoria;
        this.numeroSlotsMemoria = numeroSlotsMemoria;
        this.tipoHD = tipoHD;
        this.marcaHD = marcaHD;
        this.capacidadeHD = capacidadeHD;
        this.tipoMonitor = tipoMonitor;
        this.marcaMonitor = marcaMonitor;
        this.resolucaoMonitor = resolucaoMonitor;
        this.tipoFonte = tipoFonte;
        this.marcaFonte = marcaFonte;
        this.potenciaFonte = potenciaFonte;
        this.marcaPlacaVideo = marcaPlacaVideo;
    }

    // Métodos de acesso (Getters e Setters)
    public int getPlacasVideo() { return placasVideo; }
    public void setPlacasVideo(int placasVideo) { this.placasVideo = placasVideo; }

    public String getTipoMemoria() { return tipoMemoria; }
    public void setTipoMemoria(String tipoMemoria) { this.tipoMemoria = tipoMemoria; }

    public String getMarcaMemoria() { return marcaMemoria; }
    public void setMarcaMemoria(String marcaMemoria) { this.marcaMemoria = marcaMemoria; }

    public int getNumeroSlotsMemoria() { return numeroSlotsMemoria; }
    public void setNumeroSlotsMemoria(int numeroSlotsMemoria) { this.numeroSlotsMemoria = numeroSlotsMemoria; }

    public String getTipoHD() { return tipoHD; }
    public void setTipoHD(String tipoHD) { this.tipoHD = tipoHD; }

    public String getMarcaHD() { return marcaHD; }
    public void setMarcaHD(String marcaHD) { this.marcaHD = marcaHD; }

    public int getCapacidadeHD() { return capacidadeHD; }
    public void setCapacidadeHD(int capacidadeHD) { this.capacidadeHD = capacidadeHD; }

    public String getTipoMonitor() { return tipoMonitor; }
    public void setTipoMonitor(String tipoMonitor) { this.tipoMonitor = tipoMonitor; }

    public String getMarcaMonitor() { return marcaMonitor; }
    public void setMarcaMonitor(String marcaMonitor) { this.marcaMonitor = marcaMonitor; }

    public int getResolucaoMonitor() { return resolucaoMonitor; }
    public void setResolucaoMonitor(int resolucaoMonitor) { this.resolucaoMonitor = resolucaoMonitor; }

    public String getTipoFonte() { return tipoFonte; }
    public void setTipoFonte(String tipoFonte) { this.tipoFonte = tipoFonte; }

    public String getMarcaFonte() { return marcaFonte; }
    public void setMarcaFonte(String marcaFonte) { this.marcaFonte = marcaFonte; }

    public int getPotenciaFonte() { return potenciaFonte; }
    public void setPotenciaFonte(int potenciaFonte) { this.potenciaFonte = potenciaFonte; }

    public String getMarcaPlacaVideo() { return marcaPlacaVideo; }
    public void setMarcaPlacaVideo(String marcaPlacaVideo) { this.marcaPlacaVideo = marcaPlacaVideo; }

    // Métodos de entrada de dados
    public void entrada(Scanner scanner) {
        super.entrada(scanner);  // Chama o método de entrada da classe Computador
        System.out.print("Placas de Vídeo: ");
        this.placasVideo = scanner.nextInt();
        scanner.nextLine();  // Consome a linha em branco após o nextInt()
        System.out.print("Tipo de Memória: ");
        this.tipoMemoria = scanner.nextLine();
        System.out.print("Marca da Memória: ");
        this.marcaMemoria = scanner.nextLine();
        System.out.print("Número de Slots de Memória: ");
        this.numeroSlotsMemoria = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Tipo de HD: ");
        this.tipoHD = scanner.nextLine();
        System.out.print("Marca do HD: ");
        this.marcaHD = scanner.nextLine();
        System.out.print("Capacidade do HD: ");
        this.capacidadeHD = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Tipo de Monitor: ");
        this.tipoMonitor = scanner.nextLine();
        System.out.print("Marca do Monitor: ");
        this.marcaMonitor = scanner.nextLine();
        System.out.print("Resolução do Monitor: ");
        this.resolucaoMonitor = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Tipo de Fonte: ");
        this.tipoFonte = scanner.nextLine();
        System.out.print("Marca da Fonte: ");
        this.marcaFonte = scanner.nextLine();
        System.out.print("Potência da Fonte: ");
        this.potenciaFonte = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Marca da Placa de Vídeo: ");
        this.marcaPlacaVideo = scanner.nextLine();
    }

    // Método para imprimir os dados
    public void imprimir() {
        super.imprimir();
        System.out.println("Placas de Vídeo: " + placasVideo);
        System.out.println("Tipo de Memória: " + tipoMemoria);
        System.out.println("Marca da Memória: " + marcaMemoria);
        System.out.println("Número de Slots de Memória: " + numeroSlotsMemoria);
        System.out.println("Tipo de HD: " + tipoHD);
        System.out.println("Marca do HD: " + marcaHD);
        System.out.println("Capacidade do HD: " + capacidadeHD);
        System.out.println("Tipo de Monitor: " + tipoMonitor);
        System.out.println("Marca do Monitor: " + marcaMonitor);
        System.out.println("Resolução do Monitor: " + resolucaoMonitor);
        System.out.println("Tipo de Fonte: " + tipoFonte);
        System.out.println("Marca da Fonte: " + marcaFonte);
        System.out.println("Potência da Fonte: " + potenciaFonte);
        System.out.println("Marca da Placa de Vídeo: " + marcaPlacaVideo);
    }
}
