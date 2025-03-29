import java.util.Scanner;

public class Notebook extends Computador {
    private double tamanhoTela;
    private double peso;
    private String tipoBateria;
    private int capacidadeBateria;
    private String tipoTeclado;
    private boolean temWebcam;
    private boolean temBluetooth;
    private String marcaWebcam;
    private String versaoBluetooth;

    // Construtores
    public Notebook() {}

    public Notebook(String marca, double preco, int quantidade, double tamanhoTela, double peso,
                    String tipoBateria, int capacidadeBateria, String tipoTeclado,
                    boolean temWebcam, boolean temBluetooth, String marcaWebcam, String versaoBluetooth) {
        super(marca, preco, quantidade);
        this.tamanhoTela = tamanhoTela;
        this.peso = peso;
        this.tipoBateria = tipoBateria;
        this.capacidadeBateria = capacidadeBateria;
        this.tipoTeclado = tipoTeclado;
        this.temWebcam = temWebcam;
        this.temBluetooth = temBluetooth;
        this.marcaWebcam = marcaWebcam;
        this.versaoBluetooth = versaoBluetooth;
    }

    // Métodos de acesso (Getters e Setters)
    public double getTamanhoTela() { return tamanhoTela; }
    public void setTamanhoTela(double tamanhoTela) { this.tamanhoTela = tamanhoTela; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    public String getTipoBateria() { return tipoBateria; }
    public void setTipoBateria(String tipoBateria) { this.tipoBateria = tipoBateria; }

    public int getCapacidadeBateria() { return capacidadeBateria; }
    public void setCapacidadeBateria(int capacidadeBateria) { this.capacidadeBateria = capacidadeBateria; }

    public String getTipoTeclado() { return tipoTeclado; }
    public void setTipoTeclado(String tipoTeclado) { this.tipoTeclado = tipoTeclado; }

    public boolean isTemWebcam() { return temWebcam; }
    public void setTemWebcam(boolean temWebcam) { this.temWebcam = temWebcam; }

    public boolean isTemBluetooth() { return temBluetooth; }
    public void setTemBluetooth(boolean temBluetooth) { this.temBluetooth = temBluetooth; }

    public String getMarcaWebcam() { return marcaWebcam; }
    public void setMarcaWebcam(String marcaWebcam) { this.marcaWebcam = marcaWebcam; }

    public String getVersaoBluetooth() { return versaoBluetooth; }
    public void setVersaoBluetooth(String versaoBluetooth) { this.versaoBluetooth = versaoBluetooth; }

    // Método de entrada de dados
    public void entrada(Scanner scanner) {
        super.entrada(scanner); // Chama o método de entrada da superclasse
        System.out.print("Tamanho da Tela (polegadas): ");
        this.tamanhoTela = scanner.nextDouble();
        System.out.print("Peso (kg): ");
        this.peso = scanner.nextDouble();
        scanner.nextLine(); // Consome a linha em branco após nextDouble()
        System.out.print("Tipo de Bateria: ");
        this.tipoBateria = scanner.nextLine();
        System.out.print("Capacidade da Bateria (mAh): ");
        this.capacidadeBateria = scanner.nextInt();
        scanner.nextLine(); // Consome a linha em branco
        System.out.print("Tipo de Teclado: ");
        this.tipoTeclado = scanner.nextLine();
        System.out.print("Possui Webcam (true/false)? ");
        this.temWebcam = scanner.nextBoolean();
        System.out.print("Possui Bluetooth (true/false)? ");
        this.temBluetooth = scanner.nextBoolean();
        scanner.nextLine(); // Consome a linha em branco
        System.out.print("Marca da Webcam: ");
        this.marcaWebcam = scanner.nextLine();
        System.out.print("Versão do Bluetooth: ");
        this.versaoBluetooth = scanner.nextLine();
    }

    // Método para imprimir os dados
    public void imprimir() {
        super.imprimir(); // Chama o método imprimir da superclasse
        System.out.println("Tamanho da Tela: " + tamanhoTela + " polegadas");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Tipo de Bateria: " + tipoBateria);
        System.out.println("Capacidade da Bateria: " + capacidadeBateria + " mAh");
        System.out.println("Tipo de Teclado: " + tipoTeclado);
        System.out.println("Possui Webcam: " + (temWebcam ? "Sim" : "Não"));
        System.out.println("Possui Bluetooth: " + (temBluetooth ? "Sim" : "Não"));
        System.out.println("Marca da Webcam: " + marcaWebcam);
        System.out.println("Versão do Bluetooth: " + versaoBluetooth);
    }
}
